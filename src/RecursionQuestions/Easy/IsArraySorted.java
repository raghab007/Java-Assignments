package RecursionQuestions.Easy;

public class IsArraySorted {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8};
        int [] otherNumbers = {1,2,3,4,5,0};
        System.out.println(isArraySorted(numbers,0));
        System.out.println(isArraySorted(otherNumbers,0));

    }

    public static boolean  isArraySorted(int [] array, int index){

        if (index==array.length-2 && array[index]<array[index+1]){
            return  true;
        }else if (index==array.length-2 && array[index]>array[index+1]){
            return false;
        }
        return array[index]<array[index+1] && isArraySorted(array, index+1);
    }
}
