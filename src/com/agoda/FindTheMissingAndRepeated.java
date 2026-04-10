package com.agoda;

import java.util.HashSet;

public class FindTheMissingAndRepeated {


    public static void main(String[] args) {

        //int grid[][] = {{1,3}, {2,2}};
        int grid[][] = {{9,1,7},{8,9,2},{3,4,6}};
        //send the input :
        int[] missingAndRepeated = findMissingAndRepeated(grid);
        //repeated ::
        System.out.println("repeated :: "+ missingAndRepeated[0]);
        //missing ::
        System.out.println("missing :: "+missingAndRepeated[1]);

    }

    //find the missing and repeated value!!

    public static int[] findMissingAndRepeated(int[][] grid) {
        //use the data stucture
        HashSet<Integer> hashSet = new HashSet();
        int n = grid.length;
        //calculate the square
        int sqr = n * n;
        int curSum = 0;

        int ans[] = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (hashSet.contains(grid[i][j])) {
                    //means duplicate add to set
                    ans[0] = grid[i][j];

                } else {
                    //otherwise add to  set
                    hashSet.add(grid[i][j]);

                    //calaculate the sum
                    curSum = curSum + grid[i][j];
                }
            }
        }

        int totalSum=sqr*(sqr+1)/2;
        ans[1]=totalSum-curSum;
        //missing number
        return ans;
    }
}
