import java.util.Scanner;

public class Problem1281 {
    public static void main(String[]args){

        Scanner numberScan = new Scanner(System.in);

        int number = 0;
        while (number <=0){
            System.out.print("gimme a number plz: ");
            number = numberScan.nextInt();
        }

        int difference = subtractProductAndSum(number);
        System.out.print("The difference between the Product and the sum of it's digits is " + difference );
    }
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
