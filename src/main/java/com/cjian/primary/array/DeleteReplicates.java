package com.cjian.primary.array;

/**
 * @Author: cjian
 * @Date: 2022/10/12 9:53
 * @Des: 删除升序数组中的重复项 https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2gy9m/
 */
public class DeleteReplicates {
    public static void main(String[] args) {

    }

    // 1,2,2,3,4,4,4,5
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //游标
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index - 1]) {
                //相等，游标不动，继续遍历下一个
                continue;
            }
            //不相等，将游标移到当前位置
            nums[index] = nums[i];
            index++;
        }
        return index;
    }
}
