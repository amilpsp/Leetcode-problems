import java.util.Arrays;
import java.util.Comparator;

public class Current_Problem1232 {
    public static void main(String[]args){
        int[][] coordinates = {{2,1},{4,2},{6,3}};
        boolean straight = checkStraightLine(coordinates);
        System.out.println(straight);
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        Arrays.sort(coordinates, Comparator.comparingInt(x -> x[0]));
        for (int[] point:coordinates){
            System.out.println(point[0]+","+point[1]);
        }
        int Xn = coordinates[coordinates.length-1][0];
        int Yn = coordinates[coordinates.length-1][1];
        int X1 = coordinates[0][0];
        int Y1 = coordinates[0][1];

        double m;      //slope
        int c;      //constant

        if ( Yn-Y1 == 0) {// this means Y doesn't change and it'd have to be the same in all points for this to be true
            System.out.println("Yn-Y1 == 0");
            for (int i = 1; i < coordinates.length; i++) {
                if (coordinates[i][1] != Y1) {
                    return false;
                }
            }
            return true;
        }
        else if (Xn-X1 == 0){  // that means X doesn't change, so it'd have to be the same in all points.
            System.out.println("Xn-X1 == 0");
            for (int i=1; i < coordinates.length; i++){
                if (coordinates[i][0]!=X1){
                    return false;
                }
            }
            return true;
        }
        else{
            System.out.println("Not a corner case");
            System.out.println("("+Yn+"-"+Y1+")/("+Xn+"-"+X1+")");
            m =(Yn-Y1)/(Xn-X1);
            System.out.println(m);
        }

        c = (int) (Y1 - m * X1);

        // y = m * x + c
        if (m==0){
            System.out.println("slope is 0, so it's a constant");
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
