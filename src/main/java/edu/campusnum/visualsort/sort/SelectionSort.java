package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;
import edu.campusnum.visualsort.model.Order;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class SelectionSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int length = array.getLength();
        int i=0;
        int test= i;
       while(i<length){
           int j =0;
           while (j<length-1){
               Order value =array.compare(j, test);
               if (value == Order.Higher){
                   test = j;
                   array.swap(i, test);
               }
             j++;
           }
           i++;
           test = i;
       }
    }
}
