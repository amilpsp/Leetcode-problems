import java.util.Arrays;

public class Problem1502 {

    public static void main (String [] args){
        int [] arr= {2,4,1};
        boolean isProgressionArithmetic= canMakeArithmeticProgression(arr);
        System.out.println(isProgressionArithmetic);
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference= arr[1]-arr[0];
        boolean arithmetic=true;
        for (int i=1; i< arr.length-1;i++){
            if (arr[i+1]-arr[i]!=difference){
                arithmetic=false;
            }
        }
        return arithmetic;
    }
}
