public class ispalindrome {
    public boolean isPalindrome(int x) {
        if(x==-1) return false;
        int arg = (int)(Math.log10(x))+1;
        return (x==rev(x , arg));
    }
    
    public int rev(int x , int arg){
        if(x%10==x) return x;
        int rem = x%10;
        return rem*(int)Math.pow(10 , arg-1) + rev(x/10 , arg-1);
    }
    public static void main(String[] args) {
        
    }
}
