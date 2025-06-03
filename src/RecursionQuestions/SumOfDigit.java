package RecursionQuestions;

public class SumOfDigit {

    public static void main(String[] args) {
        System.out.println(sumOfDigit(10));
        System.out.println(sumOfDigit(12345));
        System.out.println(sumOfDigit(1));
        System.out.println(sumOfDigit(2));
        System.out.println(sumOfDigit(123456789));
    }
    static int sumOfDigit(int n){
        if (n==0){
            return 0;
        }
        if (n<10){
            return n;
        }
        int a = n%10;
        int newNumber = n /10;
        return a+sumOfDigit(newNumber);

    }
}
