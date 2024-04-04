package javatest;

import java.util.Arrays;


public class WinSoft {


    private static void merge(int[] X, int[] Y, int m, int n)
    {
        // size of `X[]` is `k+1`
        int k = m + n + 1;
 
        // run if X[] or Y[] has elements left
        while (m >= 0 && n >= 0)
        {
        	
            if (X[m] > Y[n]) {
                X[k--] = X[m--];
            }
            else {
                X[k--] = Y[n--];
            }
        }
 
        // copy the remaining elements of `Y[]` (if any) to `X[]`
        while (n >= 0) {
            X[k--] = Y[n--];
        }
 
        Arrays.fill(Y, 0);
    }
 
   
    public static void rearrange(int[] X, int[] Y)
    {
        if (X.length == 0) {
            return;
        }
 
        int k = 0;
        for (int value: X)
        {
            if (value != 0) {
                X[k++] = value;
            }
        }
 
        // merge `X[0…k-1]` and `Y[0… n-1]` into `X[0… m-1]`
        merge(X, Y, k - 1, Y.length - 1);
    }
 
    public static void main (String[] args)
    {
        // vacant cells in `X[]` is represented by 0
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = { 1, 8, 9, 10, 15 };
 
        
        // merge `Y[]` into `X[]`
        rearrange(X, Y);
 
        // print merged array
        System.out.println(Arrays.toString(X));
    }
}

