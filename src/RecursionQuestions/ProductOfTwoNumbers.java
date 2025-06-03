package RecursionQuestions;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println(productOfNumbers(3,3));
        System.out.println(productOfNumbers(2,3));
        System.out.println(productOfNumbers(10,10));
    }

    static  int productOfNumbers(int a, int b){


        if (b==0 || a==0){
            return 0;
        }

        return  a+ productOfNumbers(a,b-1);
    }
}
