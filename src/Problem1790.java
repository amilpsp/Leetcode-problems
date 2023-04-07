import java.util.Arrays;

public class Problem1790 {
    /*You are given two strings s1 and s2 of equal length. A string
    swap is an operation where you choose two indices in a string
    (not necessarily different) and swap the characters at these indices.

    Return true if it is possible to make both strings equal by performing
    at most one string swap on exactly one of the strings. Otherwise, return false.*/
    public static void main (String[] args){
        String s1="attack";
        String s2="attkac";
        boolean swappable=areAlmostEqual(s1,s2);
        System.out.println(swappable);
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        char[] letters1 = s1.toCharArray();
        Arrays.sort(letters1);
        char[] letters2 = s2.toCharArray();
        Arrays.sort(letters2);

        if (!Arrays.equals(letters1,letters2))
                return false;
        else {
            int counter=0;
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i)!=s2.charAt(i)){
                    counter+=1;
                }
            }
            if (counter>2) return false;
            else return true;
        }
    }
}
/*Better solution 0ms runtime
*
* class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        char[][] arr = new char[2][2];
        int j = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(j >= 2)
                    return false;
                arr[j][0] = s1.charAt(i);
                arr[j][1] = s2.charAt(i);
                j++;
            }
        }
        if(arr[0][0] == arr[1][1] && arr[1][0] == arr[0][1])
            return true;
        return false;
    }
}*/