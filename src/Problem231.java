public class Problem231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return ( Math.log10(n) / Math.log10(2) ) % 1 == 0;
/*Since in java we don't have generic log method to calculate in base b,
we can use log property logba = logca/logcb. now we have number digits-1
if there is no decimals i.e. %1 will be zero in such case. return true*/
        }
    }
}
