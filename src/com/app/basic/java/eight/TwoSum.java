package com.app.basic.java.eight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }

    }

    private int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){


        }

        return new int[]{};
    }
}
