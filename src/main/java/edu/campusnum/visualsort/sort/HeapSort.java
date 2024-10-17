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
        organize(array);
        for (int i=array.getLength()-1; i>=0; i--) {
            array.swap(0, i);
            goDown(array, 0, i);
        }
    }
    public void organize(ObservableArray array) {
        for (int i = 0; i < array.getLength()-1; i++) {
            goUp(array, i);
        }
    }
    public void goUp(ObservableArray array, int index) {
        if (array.get(index)>array.get(index/2)) {
            array.swap(index, index/2);
            goUp(array, index/2);
        }
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
