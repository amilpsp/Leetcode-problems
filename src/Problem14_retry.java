public class Problem14_retry {
/*Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".*/
    public static void main (String[] args){
        String[] strAr1=new String[] {"Ani", "Sam", "Joel"};
        String longestCP = longestCommonPrefix(strAr1);
        System.out.print(longestCP);
    }
        public static String longestCommonPrefix(String[] strings) {
        int biggestLength = getLongestStringsLenght(strings);
        for (int i =0; i<strings.length;i++){
            for (int j=0; j<biggestLength;j++){
                if (strings[i].charAt(j)==strings[i+1].charAt(j)){


                }
            }
        }
        /*    char prevChar=strs[0].charAt(0);
            int k=0;

            for (int i=0; i < strs.length; i++){    //characters
                for (int j=0; j< strs.length; j++){ //words
                    allLetters+=strs[j].charAt(i);
                }
            }*/
            return allLetters;
        }
    public static int getLongestStringsLenght(String []strings) {
        //  String strings[] =  {"cat","chicken","horse","ooooooooo" };
        int biggestLength=0;
        int i;
        for (i = 0; i < strings.length; i++) {
            if (strings[i].length() > strings[i + 1].length()) {
                biggestLength= (strings[i].length());
            }
        }
        if (biggestLength < strings[-1].length()) {
            biggestLength = strings[-1].length();
        }

        return biggestLength;
    }

}

