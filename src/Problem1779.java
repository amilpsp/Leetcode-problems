import java.util.LinkedList;
import java.util.List;
import static java.lang.Math.abs;

public class Problem1779 {

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
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[][] points = {{1, 2}, {3, 1}, {2, -4}, {-2, 3}, {4, 4}, {8, 2}, {3, 3}, {2, 7}, {2, 2}, {1, 3}, {3, 15}, {4, 4}, {3, 4}};
        int nearestIndex = nearestValidPoint(x, y, points);

    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int nearestIndex=-1;
        List compatibles = new LinkedList();


        for (int i = 0; i < points.length; i++) {
//Making a list of compatible points' indexes
            if (x == points[i][0] || y == points[i][1]) {
                compatibles.add(i);
            }
        }

//using the values at those indexes for comparison
        for (int j = 0; j < compatibles.size() - 1; j++) {
            int xJ = points[(int) compatibles.get(j)][0];
            int yJ = points[(int) compatibles.get(j)][1];

            int xJ1 = points[(int) compatibles.get(j + 1)][0];
            int yJ1 = points[(int) compatibles.get(j + 1)][1];

            if ((abs(x - xJ) + abs(y - yJ)) < (abs(x - xJ1) + abs(y - yJ1))) {
                nearestIndex = (int) compatibles.get(j);
                System.out.println("index: " + nearestIndex);
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
}