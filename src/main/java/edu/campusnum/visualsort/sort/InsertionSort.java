package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;
import edu.campusnum.visualsort.model.Order;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 14:55
 */
public class InsertionSort  implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int length = array.getLength();
        int i =0;
        while (i<length) {
            while (i < length-1) {
                System.out.println("Insertion Sort");
                Order value = array.compare(i,i+1);
                if (value == Order.Higher){
                    array.swap(i,i+1);
                }
                else{
                    System.out.println("not moving");
                }
                i++;
            }
            i=0;
            length--;

        }


    }
}
