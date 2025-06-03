package RecursionQuestions.Easy;

import java.util.Arrays;

public class ReverseString {


    public static void main(String[] args) {
        char[]chars =  new char[]{'H','a','n','n','a','h'};
        new ReverseString().reverseString(chars);
        System.out.println(Arrays.toString(chars));


    }
    public  void reverseString(char[] s) {
        int length = s.length;
        if (currentIndex>(length/2)-1){
            return;
        }
        char a  = s[currentIndex];
        char temp = s[s.length-1-currentIndex];
        s[currentIndex] = temp;
        s[s.length-1-currentIndex] = a;
        currentIndex++;
        reverseString(s);
    }

    static int currentIndex = 0;

}


