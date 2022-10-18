package com.cjian.primary.array;

import java.util.HashMap;

/**
 * @Author: cjian
 * @Date: 2022/10/13 11:06
 * @Des: 两数之和 https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2jrse/
 */
public class SumNum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
