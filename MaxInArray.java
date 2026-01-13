package com.company;

public class MaxInArray {
    public static void main(String[] args) {
        int[] nums = {10,20,5,16,25};
        if (check(nums)){System.out.print("Array: ");
            for (int n : nums) System.out.print(n + " ");
            System.out.println("\nMax = " + findMax(nums));}
        else{
            System.out.println("Array must not be empty");
        }

    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int v : arr) if (v > max) max = v;
        return max;
    }
    public static boolean check(int[] array) {
        if (array != null && array.length > 0) {
            return true;
        } else {
            return false;
        }
    }

}
