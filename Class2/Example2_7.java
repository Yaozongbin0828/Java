package yao.zongbin;

import java.lang.reflect.Array;
import java.util.*;

public class Example2_7 {
    public static void main(String[] args) {
        int[] a = {12, 34, 9, 23, 45, 6, 45, 90, 123, 19, 34};

        // sort() 对指定T型数组按数字升序排序。
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); //{6,9,12,19,23,34,34,45,45,90,123}

        int number = 45;
        // binarySearch() 已经排好序的数组中查找指定的元素，并返回该元素的下标
        int index = Arrays.binarySearch(a, number);
        if (index >= 0) {
            System.out.println(number + "数组中索引为" + index + "的元素值相同"); //45 8

        } else {
            System.out.println(number + "不与数组中的任何元素值相同");//45
        }
    }
}
