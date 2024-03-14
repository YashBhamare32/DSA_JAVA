public class reverseNum {
    int sum=0;
    public boolean isPalindrome(int x) {
        return (x==rev(x));
    }
    public int rev(int x){
        if(x<0) x*=-1;
        if(x==0) return 0;
        int rem = rem(x);
        sum = sum*10 + rem;
        rev(x/10);
        return sum;
    }
    public int rem(int x){
        return x%10;
    }
    public static void main(String[] args) {
        
    }
}
