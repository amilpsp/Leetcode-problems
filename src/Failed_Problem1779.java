import java.util.LinkedList;
import static java.lang.Math.abs;

public class Failed_Problem1779 {

    /*You are given two integers, x and y, which represent your current
    location on a Cartesian grid: (x, y). You are also given an array
    points where each points[i] = [ai, bi] represents that a point exists
    at (ai, bi). A point is valid if it shares the same x-coordinate or
    the same y-coordinate as your location.

    Return the index (0-indexed) of the valid point with the smallest
    Manhattan distance from your current location. If there are multiple,
    return the valid point with the smallest index.

    If there are no valid points, return -1.

    The Manhattan distance between two points (x1, y1) and (x2, y2)
    is abs(x1 - x2) + abs(y1 - y2).

        Constraints:

    1 <= points.length <= 104
    points[i].length == 2
    1 <= x, y, ai, bi <= 104 */
 /*   public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[][] points = {{1, 2}, {3, 1}, {2, -4}, {-2, 3}, {4, 4}};
        int nearestIndex = nearestValidPoint(x, y, points);
        System.out.print(nearestIndex);
    }*/

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int nearestIndex = points.length-1;
        LinkedList compatibles = new LinkedList();
        LinkedList nearestDistances = new LinkedList();

        for (int i = 0; i < points.length; i++) {
//Making a list of compatible points' indexes
            if (x == points[i][0] || y == points[i][1]) {
                compatibles.add(i);
            }
        }

        if (compatibles.size()>0){

//using the values at those indexes for comparison
            for (int j = compatibles.size() - 1; j >= 0;  j--) {
                int xJ = points[(int) compatibles.get(j)][0];
                int yJ = points[(int) compatibles.get(j)][1];

                for (int k = compatibles.size()-2; k >=1 ; k--){
                    int xJK = points[(int) compatibles.get(j - k)][0];
                    int yJK = points[(int) compatibles.get(j - k)][1];

                    int differenceJ=abs(x - xJ) + abs(y - yJ);
                    int differenceJK=abs(x - xJK) + abs(y - yJK);

                    if (differenceJ <= differenceJK) {
                    //    nearestDistances.add((int) compatibles.get(j),differenceJ); //trying to make a linked list with the smallest distances and their indexes to be able to pick amongst them.
                        nearestIndex = (int) compatibles.get(j);
                        System.out.println("index: " + nearestIndex);
                    }

                }
            }
            int previousX = points[nearestIndex][0];
            int previousY = points[nearestIndex][1];

            int lastX = points[points.length - 1][0];
            int lastY = points[points.length - 1][1];

//comparing with the last element, that wasn't included in the loop.
            if ((abs(x - lastX) + abs(y - lastY) < (abs(x - previousX) + abs(y - previousY)))) {
                nearestIndex = points.length - 1;
                System.out.println("index: " + nearestIndex);
            }
            return nearestIndex;
        }
        else
            return nearestIndex=-1;
    }
}