package org.yarkov.easy;

import java.util.Arrays;

public class SmallerThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            result[i] = i;
        }

        return result;
    }

}
