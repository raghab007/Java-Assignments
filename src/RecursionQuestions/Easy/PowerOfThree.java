package RecursionQuestions.Easy;

public class PowerOfThree {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(10));
        System.out.println(isPowerOfThree(11));
        System.out.println(isPowerOfThree(12));
        System.out.println(isPowerOfThree(15));
        System.out.println(isPowerOfThree(27));

    }

    public static boolean isPowerOfThree( int n){

        if (n==0){
            return false;
        }else if (n==3){
            return true;
        }
        return ( n%3==0) && isPowerOfThree(n/3);
    }
}
