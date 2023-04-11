import java.util.Arrays;
import java.util.Comparator;

public class Success_Problem1232 {
 /*   public static void main(String[]args){
        int[][] coordinates = {{2,1},{4,2},{6,3}};
        boolean straight = checkStraightLine(coordinates);
        System.out.println(straight);
    }*/
    public static boolean checkStraightLine(int[][] coordinates) {
        Arrays.sort(coordinates, Comparator.comparingInt(x -> x[0]));

        double Xn = coordinates[coordinates.length-1][0];
        double Yn = coordinates[coordinates.length-1][1];
        double X1 = coordinates[0][0];
        double Y1 = coordinates[0][1];

        double m;      //slope
        int c;      //constant

        if ( Yn-Y1 == 0) {// this means Y doesn't change and it'd have to be the same in all points for this to be true
            for (int i = 1; i < coordinates.length; i++) {
                if (coordinates[i][1] != Y1) {
                    return false;
                }
            }
            return true;
        }
        else if (Xn-X1 == 0){  // that means X doesn't change, so it'd have to be the same in all points.
            for (int i=1; i < coordinates.length; i++){
                if (coordinates[i][0]!=X1){
                    return false;
                }
            }
            return true;
        }
        else{
            m =(Yn-Y1)/(Xn-X1);
        }

        c = (int) (Y1 - m * X1);

        // y = m * x + c
        if (m==0){
            for (int i = 1; i < coordinates.length; i++) {
                if (coordinates[i][1] != Y1) {
                    return false;
                }
            }
            return true;

        }
        else{
            for (int[] point: coordinates){
                if (point[1]!=m*point[0]+c){
                    return false;
                }
            }
            return true;
        }
    }
}
