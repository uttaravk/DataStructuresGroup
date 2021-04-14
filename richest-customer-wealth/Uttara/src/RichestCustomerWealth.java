

public class RichestCustomerWealth {

    public static void main(String[] args) {
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int[][] inAccounts1 = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int[][] inAccounts2 = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        int[][] inAccounts3 = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        System.out.println(richestCustomerWealth.maximumWealth(inAccounts1));
        System.out.println(richestCustomerWealth.maximumWealth(inAccounts2));
        System.out.println(richestCustomerWealth.maximumWealth(inAccounts3));

    }

    //Columns -> Banks & Rows -> Customers
    //Time Complexity: O(n)^2
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int noOfBanks = accounts[0].length;
        int noOfCustomers = accounts.length;
        for (int i = 0; i < noOfCustomers; i++) {
            int total = 0;
            for (int j = 0; j < noOfBanks; j++) {
                total = total + accounts[i][j];
            }
            maxWealth = Math.max(total, maxWealth);
        }
        return maxWealth;
    }

}
