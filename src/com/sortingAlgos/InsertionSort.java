package com.sortingAlgos;

public class InsertionSort extends Sort {

    private int[] array ;
    // N to N^2 and stable.
    // take one element and compare with every element before it, place where it belongs

    private InsertionSort(int[] array) {
        super(array);
        this.array = array;
    }

    @Override
    public int[] sort(){
        int temp;
        int ex;

        for(int  i = 0; i < array.length; i++){
            temp = array[i];
            for (int j = i; j >= 0; j--){
                if(temp < array[j]){
                    ex = array[j + 1];
                    array[j+1] = array[j];
                    array[j] = ex;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arra = {13, 19, 43, 57, 22, 6, 74};
        int[] arra2 = {4 ,7 ,5 ,3, 9, 2};

        Sort sort = new InsertionSort(arra);
        sort.printArray(sort.sort());
        Sort sort2 = new InsertionSort(arra2);
        sort2.printArray(sort2.sort());

    }

    @Override
    public void printArray (int[] arr){
        super.printArray(arr);
    }
}
