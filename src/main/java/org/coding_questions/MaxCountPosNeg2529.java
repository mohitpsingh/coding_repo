package org.coding_questions;

public class MaxCountPosNeg2529 {
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3,5};
        int neg=0;
        int pos=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos++;
            }
            else if(nums[i] < 0) {
                neg++;
            }
        }
        System.out.println("The Positive Count is : " + pos);
        System.out.println("The Negative Count is : " + neg);
    }
}
