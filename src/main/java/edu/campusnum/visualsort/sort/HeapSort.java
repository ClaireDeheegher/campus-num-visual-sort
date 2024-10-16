package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class HeapSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {

    }
    public void organize(ObservableArray array) {

    }
    public void goUp(ObservableArray array, int index) {

    }
    public void goDown(ObservableArray array, int index, int element) {
        int max =0;
        int formula = 2*index+1;
        if (formula<element){
            if (array.get(formula)>array.get(2*index)){
                max =formula;
            }
            else{
                max = 2*index;
            }
            if (array.get(max)>array.get(index)){
                array.swap(max,index);
                goDown(array,max,element);
            }
        }
    }

}
