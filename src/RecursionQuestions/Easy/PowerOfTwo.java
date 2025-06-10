package  RecursionQuestions.Easy;

class PowerOfTwo {

    public static void main(String[] args) {
        boolean powerOfTwo = new PowerOfTwo().isPowerOfTwo(14);
        System.out.println(powerOfTwo);
        System.out.println(new PowerOfTwo().isPowerOfTwo(22));
        System.out.println(new PowerOfTwo().isPowerOfTwo(128));
        System.out.println(new PowerOfTwo().isPowerOfTwo(64));
        System.out.println(new PowerOfTwo().isPowerOfTwo(70));



    }
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        return (n%2==0)&& isPowerOfTwo(n/2);
    }
}