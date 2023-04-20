import java.util.Stack;

public class Success_Revisit_Problem345_ReverseVowelsOfAString {
/*  public static void main (String [] args){
        String s = "Hello darling";
        String s1=reverseVowels(s);
        }
*/
    public static String reverseVowels(String s) {
        Stack<Character> vowelStack = new Stack<>();

        for (int i=0; i<s.length();i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
                    ||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                vowelStack.push(s.charAt(i));

            }
        }

        String str="";


        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
                    ||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                str+=vowelStack.pop();
            }
            else
                str+=s.charAt(i);
        }
        return str;
    }
}
