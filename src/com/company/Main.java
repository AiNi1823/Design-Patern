package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {56,12,31,17,40,97,21,14,78,63};
        QS(a, 0, a.length - 1);
        for (int i : a) {
            System.out.println(i + " ");
        }
    }

    private static void QS(int[] a,int start,int end) {
        if (a.length < 0) {
            return;
        }
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int temp = a[left];
        while (left < right) {
            while (left < right && a[right] >= temp) {
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] <= temp) {
                left++;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        System.out.println(Arrays.toString(a));
        QS(a, start, left - 1);
        QS(a, left + 1, end);
    }
}
