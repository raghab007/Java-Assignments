package RecursionQuestions.Easy;

public class FibonacciNumber {

    public static void main(String[] args) {

        System.out.println(getFibonacciNumber(1));
    }

    // Finding fibonacci number using recursion...
    public static int getFibonacciNumber(int n) {
       if (n<=2){
           return n;
       }
        return getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
    }
}
