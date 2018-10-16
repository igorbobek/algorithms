package by.sorting;

import java.util.Arrays;

public class MergeSort implements Sorting {

    public void sort(int[] currentArray){
        int length = currentArray.length;
        int middle = length / 2;

        int[] first = Arrays.copyOfRange(currentArray, 0, middle);
        int[] second = Arrays.copyOfRange(currentArray, middle, length);

        if(middle != 0) {
            sort(first);
            sort(second);
        }

        merge(first, second, currentArray);
    }


    private void merge(int first[], int[] second, int[] result){
        int firstSize = first.length;
        int secondSize = second.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < firstSize && j < secondSize){

            if(first[i] < second[j]){
                result[k++] = first[i++];
            }else {
                result[k++] = second[j++];
            }

        }

        while(i < firstSize){
            result[k++] = first[i++];
        }

        while(j < secondSize){
            result[k++] = second[j++];
        }

    }

}
