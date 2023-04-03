import java.util.Arrays;

public class Problem976 {
    public int largestPerimeter(int[] nums) {
        int perimeter=0;
        int i;
        Arrays.sort(nums);
        for (i= nums.length-1 ; i>=2 ; i--){

            int a = nums [i];
            int b = nums [i-1];
            int c = nums [i-2];

            if (a+b>c && b+c>a && a+c>b && a+b+c > perimeter){
                perimeter = a+b+c;
            }
        }
        return perimeter;
    }
}
