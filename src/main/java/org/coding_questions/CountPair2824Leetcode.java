package org.coding_questions;

public class CountPair2824Leetcode {
    public static void main(String[] args) {
        int nums[] = {-1,1,2,3,1};
        int target = 2;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] < target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
