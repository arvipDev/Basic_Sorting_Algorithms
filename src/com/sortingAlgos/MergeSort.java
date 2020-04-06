package com.sortingAlgos;

public class MergeSort extends Sort {

    // NlogN to NlogN. Stable.
    // divide and conquer algorithm



    private MergeSort(int[] array) {
        super(array);
    }

    @Override
    public void printArray (int[] arr){
        super.printArray(arr);
    }

    @Override
    protected int[] sort(int[] array) {
        int size = array.length;
        int sizeL = size/2;
        int sizeR = size - sizeL;
        int ptr = 0;
        int[] arrL = new int[sizeL];
        int[] arrR = new int[sizeR];

        if(size < 2){
            return array;
        }
        while (ptr < sizeL){
            arrL[ptr] = array[ptr];
            ptr++;
        }
        ptr = 0;
        while (ptr < sizeR) {
            arrR[ptr] = array[sizeL + ptr];
            ptr++;
        }

        sort(arrL);
        sort(arrR);
        merge(array, arrL, arrR);

        return array;
    }

    private void merge (int[] leftright, int[] left, int[] right){

        int atLR = 0, atL = 0, atR = 0;
        int sizeLR = leftright.length;
        int sizeL = left.length;
        int sizeR = right.length;

        while (atL < sizeL && atR < sizeR){
            if(left[atL] <= right[atR]){
                leftright[atLR] = left[atL];
                atL++;
            }
            else if(right[atR] <= left[atL]){
                leftright[atLR] = right[atR];
                atR++;
            }
            atLR++;
        }

        while(atL == sizeL && atLR != sizeLR){
            leftright[atLR] = right[atR];
            atR++;
            atLR++;
        }

        while(atR == sizeR && atLR != sizeLR){
            leftright[atLR] = left[atL];
            atL++;
            atLR++;
        }
    }

    public static void main(String[] args) {
        int[] arra = {13, 19, 43, 57, 22, 6, 74};
        int[] arra2 = {4 ,7 ,5 ,3, 9, 2};

        Sort sort = new MergeSort(arra);
        sort.printArray(sort.sort(arra));
        Sort sort2 = new MergeSort(arra2);
        sort2.printArray(sort2.sort(arra2));
    }
}
