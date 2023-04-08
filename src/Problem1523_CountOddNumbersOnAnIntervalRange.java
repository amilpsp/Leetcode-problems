public class Problem1523_CountOddNumbersOnAnIntervalRange {
    class MySolution {
        public int countOdds(int low, int high) {

            int count = 0;
            int diff = high - low;
            count = diff/2;
            if(low % 2 == 1 || high % 2 == 1 ) {count++;}

            return count;
        }
    }

    class GreatSolutionToLearnFrom {
        public int countOdds(int low, int high) {
            int count=0;
            return (low % 2 == 0 && high % 2 == 0) ? (high - low) / 2 : (high - low) / 2 + 1;

        }
    }

}
