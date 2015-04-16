package me.cyning.algorithm.chapter2;

import java.util.Arrays;
import java.util.Collections;

/**
 * Author: cyning
 * Date  : 2015.04.16
 * Time  : 下午9:04
 * Desc  : 插入排序
 */
public class InsertSort {

    public static  void insertSort(int[] arr){

        if (arr == null || arr.length <= 0){
            throw  new NullPointerException("the arr is error");

        }
        else{
            int size = arr.length;
            for (int i = 1; i < size; i++) {// start from 1(the second number)

                int temp = arr[i];

                insortSortedSque(temp,arr,i-1);


            }
        }
    }

    /**
     * 将已经排好序的sortedSqu[0] -- sortedSqu[last]中插入一个temp
     * @param temp
     * @param sortedSqu
     * @param last
     */
    public static void insortSortedSque(int temp ,int[] sortedSqu,int last){

        int start = 0;
        int end = last;

        while (end >= 0 && sortedSqu[end] > temp){
            sortedSqu[end+1] = sortedSqu[end];
            sortedSqu[end] = temp;
            end --;
        }

    }

    public static void main(String[] args) {
        int[] arrs = {3,5,2,6,4,1};
        insertSort(arrs);
        printArr(arrs);
    }

    public static  void printArr(int[] arrs){
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]+"-");
        }

    }
}
