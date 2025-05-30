
package RecursionQuestions;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        char [] chars = new char[]{'h','e','l','l','o'};
        new Solution().reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
    public void reverseString(char[] s) {
        int length  = s.length;
        for(int i =0;i<(length)/2;i++){
            int indexFromLast = (length-1)-i;
            char temp =  s[indexFromLast];
            s[indexFromLast] = s[i];
            s[i] = temp;
        }
    }
}