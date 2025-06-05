package  RecursionQuestions.Easy;

class PowerOfTwo {

    public static void main(String[] args) {
        boolean powerOfTwo = new PowerOfTwo().isPowerOfTwo(14);
        System.out.println(powerOfTwo);

    }
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        return (n%2==0)&& isPowerOfTwo(n/2);
    }
}