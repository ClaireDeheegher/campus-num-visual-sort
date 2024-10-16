package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;
import edu.campusnum.visualsort.model.Order;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:32
 */
public class BubbleSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {

        boolean swapped = true;
        int length = array.getLength();
        while (swapped) {
            swapped = false;
            for (int j = 0; j < length-1; j++) {

                Order value = array.compare(j,j+1);
                if (value == Order.Higher){
                    array.swap(j, j+1);
                    swapped = true;
                    j++;
                }
            }



        }
    }
}