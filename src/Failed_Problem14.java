public class Failed_Problem14 {
/*Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".*/

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

