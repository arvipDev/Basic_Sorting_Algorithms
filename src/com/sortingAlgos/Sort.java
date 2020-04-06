package com.sortingAlgos;

public abstract class Sort {

    private int[] array ;

    Sort(int[] array) {
        this.array = array;
    }

    public void printArray (int[] arr){
        System.out.print("[ ");
        for (int i1 : arr) {
            System.out.print(i1 + ", ");
        }
        System.out.print(" ]");
        System.out.println();
    }

    protected int[] sort() {
        return array;
    }

    protected int[] sort(int[] array) {
        return array;
    }

    protected int[] sort(int[] array, int start, int end) {
        return array;
    }
}
