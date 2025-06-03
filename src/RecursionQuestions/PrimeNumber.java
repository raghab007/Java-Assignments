package RecursionQuestions;

public class PrimeNumber {


    public static void main(String[] args) {
        System.out.println(isPrimeNumber(1,2));
        System.out.println(isPrimeNumber(10,2));
        System.out.println(isPrimeNumber(7,2));

    }


    public static boolean isPrimeNumber(int n, int divisor){
        if (n==1){
            return false;
        }else if(n==2){
            return true;
        }

        if (n==divisor){
            return  true;
        }
        if (n % divisor == 0){
            return false;
        }

       return isPrimeNumber(n, divisor+1);
    }
}
