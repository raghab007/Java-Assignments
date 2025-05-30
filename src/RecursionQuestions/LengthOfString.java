package RecursionQuestions;

public class LengthOfString {

    public static void main(String[] args) {

        System.out.println(lengthOfString("Raghab"));
    }

    public static int  lengthOfString(String str){
        if (str.isEmpty()){
            return 0;
        }
        String newString = str.substring(1);
        return 1+ lengthOfString(newString);
    }
}
