public class GuessGame{
    public int guessNumber(int n) {
        if(n==1) return 1;
        int start=0 ; 
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid)==1){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        
    }
}