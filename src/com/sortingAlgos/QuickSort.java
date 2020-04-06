package com.sortingAlgos;

public class QuickSort extends Sort {

    // NlogN to N^2 and unstable.
    // divide and conquer algorithm

    private int[] array ;


    private QuickSort(int[] array) {
        super(array);
        this.array = array;
    }

    @Override
    public void printArray (int[] arr){
        super.printArray(arr);
    }

    @Override
    protected int[] sort(int[] array, int start, int end) {
        if(start > end){
            return array;
        }
        int pivot = partition(array, start, end);
        sort(array, 0, pivot - 1);
        sort(array, pivot + 1, end);
        return array;
    }

    private int partition (int[] array, int start, int end){
        int pivot = start - 1;
        int temp;
        for (int i = start; i < end; i++){
            if(array[i] < array[end]){
                pivot++;
                if(pivot != i){
                    temp = array[i];
                    array[i] = array[pivot];
                    array[pivot] = temp;
                }
            }
        }
        temp = array[++pivot];
        array[pivot] = array[end];
        array[end] = temp;
        return pivot;
    }

    public static void main(String[] args) {
        int[] arra = {13, 19, 86, 99, 22, 6, 74};
        int[] arra2 = {4 ,7 ,5 ,3, 9, 2};

        int[] a1 = {13, 19, 43, 57};
        int[] a2 = {22, 6, 74};


        Sort sort = new QuickSort(arra);
        sort.printArray(sort.sort(arra, 0, arra.length - 1));
        Sort sort2 = new QuickSort(arra2);
        sort2.printArray(sort2.sort(arra2, 0, arra2.length - 1));
    }
}
