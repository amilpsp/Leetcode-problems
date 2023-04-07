public class Problem1822 {
    /*There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).*/
   /* public static void main (String []args){
        int[] nums={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int sign=arraySign(nums);
        System.out.println(sign);
    }*/
    public static int arraySign(int[] nums) {
        int product=1;
        for (int i=0; i< nums.length;i++){

            if (product > Math.pow(10,5)||product< -Math.pow(10,5))
                product/=100;

            product *= nums[i];

            System.out.println(product);
        }
        System.out.println(product);
        return signFunc(product);

    }
    public static int signFunc(int product){
        int sign;

        if (product<0)
            sign=-1;
        else if (product>0)
            sign=1;
        else
            sign=0;

        return sign;
    }
}
