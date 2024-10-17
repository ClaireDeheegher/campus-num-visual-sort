package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int first = 0;
        int last = array.getLength()-1;
        quickSort(array, first, last);

    }
    public void quickSort(ObservableArray array, int first, int last) {
        if (last-first >=1) {
            int pi = part(array, first, last);
            quickSort(array, first, pi-1);
            quickSort(array, pi+1, last);
        }
    }
    public int part (ObservableArray array, int first, int last) {
        int pivot = last; //Element to put in the right position
        int j = first;
        for (int i = first; i <= last-1; i++) {
            if (array.get(i)<=array.get(pivot)) {
                array.swap(i, j);
                j = j+1;
            }
        }
        array.swap(last, j);
        return j;
    }
}
