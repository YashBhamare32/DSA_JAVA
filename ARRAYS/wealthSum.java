public class wealthSum {
    public static int sum(int[] account){
        int sum = 0;
        for(int money:account){
            sum+=money;
        }
        return sum;
    }
    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for(int[] account: accounts){
            int sum = sum(account);
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
