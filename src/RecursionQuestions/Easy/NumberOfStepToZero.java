package RecursionQuestions.Easy;

public class NumberOfStepToZero {

    public static void main(String[] args) {
    }
    public  int numberOfStepsToZero(int n){

        if (n==0){
            return  0;
        } else if (n%2==0) {
            n = n/2;
            return 1+numberOfStepsToZero(n);
        }

        n = n-1;
        return 1+ numberOfStepsToZero(n);
    }
}
