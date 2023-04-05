import java.util.Scanner;

public class Problem1281 {

    public static int subtractProductAndSum(int n) {
        int nSum = n;
        int nProd = n;
        int sum = 0;
        while (nSum > 0) {
            int lastDigit = nSum % 10;
            sum += lastDigit;
            nSum /=10;
        }

        int prod = 1;
        while (nProd > 0) {
            int lastDigit = nProd % 10;
            prod *= lastDigit;
            nProd /= 10;
        }
        return prod - sum;
    }
}
