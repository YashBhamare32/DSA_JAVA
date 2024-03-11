import java.util.Arrays;

public class linearSearch {
    public static int linear(int[] arr , int key){
        for(int i=0 ; i<arr.length ; i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int[] twodlinear(int[][] arr , int key){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr[i].length ; j++){
                if(key==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {18 , 12 , 9 , 14 , 77 , 50};
        int[][] twodArr = {{1,2,3} , {4,5,6} ,{23,4,1,120} , {10,11,12}};
        int[] ans = twodlinear(twodArr, 120);
        System.out.println(Arrays.toString(ans));
    }
}
