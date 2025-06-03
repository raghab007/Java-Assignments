package RecursionQuestions;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args)   {
        int [] numbers  = new int[]{5,4,3,2,1,0};
        int [] numbers1 = {55,90,77,88,99,65,55,54,79};
        sort(numbers, numbers.length);
        sort(numbers1,numbers1.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
    }
    public static  void sort(int [] array,int lastIndex) {

        if (lastIndex==0){
            return;
        }
        int count  = 0;
        for (int i = 0; i < lastIndex - 1; i++) {
            if (array[i] > array[i+1]) {
                int a = array[i];
                array[i] = array[i+1];
                array[i+1] =a;
                count++;
            }
        }
        if (count==0){
            return;
        }
        sort(array,lastIndex-1);
    }
}
