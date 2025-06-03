package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] numbers = new int[]{9,8,7,6,5,4,3,2,1};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void sort(int [] array){

        for (int i=1; i<array.length;i++){
            if (array[i]<array[i-1]){
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
            }
        }
    }
}
