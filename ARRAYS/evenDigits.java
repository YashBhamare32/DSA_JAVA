public class evenDigits {
    public static boolean even(int num){
        int cnt = digits(num);
        
        return cnt%2==0;
    }
    public static int digits(int num){
        int cnt = 0;
        while(num!=0){
            num/=10;
            cnt++;
        }
        return cnt;
    }
    public static int digits2(int num){
        if(num<0) num*=-1;

        return (int)(Math.log10(num))+1;
    }


    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,78966};
        System.out.println(findNumbers(arr));
    }   
}
