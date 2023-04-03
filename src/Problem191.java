public class Problem191 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
/*
            int sum = 0;
            int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();

            for (int i=0; i < digits.length; i++){
                if (digits[i]>0){
                    sum += 1;
                }
            }
            return sum;*/
            return Integer.bitCount(n);     //google told me, but I still want to figure this out.
        }
    }
}
