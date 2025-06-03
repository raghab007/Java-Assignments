package RecursionQuestions;

public class BinarySearch {

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(numbers,0,numbers.length-1, 6));
    }

    static  int binarySearch(int[] array, int start, int end, int target){
        if (start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if (array[mid]==target){
            return mid;
        }else if (array[mid]>target){
            end = end -1;
           return binarySearch(array,start,end,target);
        }
        return binarySearch(array,start+1,end,target);
    }
}
