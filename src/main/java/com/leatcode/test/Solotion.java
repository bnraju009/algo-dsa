package com.leatcode.test;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tarData = target-nums[i];
            if(map.containsKey(tarData)){
                return new int[]{map.get(tarData), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result1 = twoSum(new int[]{2, 44, 11, 7}, 9);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        int[] result2 = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        int[] result3 = twoSum(new int[]{3, 3,3,6,6}, 9);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}
