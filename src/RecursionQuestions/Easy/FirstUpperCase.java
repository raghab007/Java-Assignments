package RecursionQuestions.Easy;

public class FirstUpperCase {

    public static void main(String[] args) {
        String geeksforgeeKs = "geeksforgees";
        System.out.println(firstUpperCase(geeksforgeeKs,0));
    }


    // I can do this by shrinking the string without passing the current index also...
    static String firstUpperCase(String string, int current){
        if (current>=string.length()-1){
            return null ;
        }
        String c = String.valueOf(string.charAt(current));
        if (c.equals(c.toUpperCase())){
            return c;
        }else {
           return firstUpperCase(string,current+1);
        }
    }
}
