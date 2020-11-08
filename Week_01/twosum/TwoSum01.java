package com.chaoxuzhong.study.algorithm.twosum;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表
// 👍 9524 👎 0

import java.util.HashMap;
import java.util.Map;

public class TwoSum01 {
    public static int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            // 减去后的值
            int num = target - nums[i];
            if (map.containsKey(num)) {
                int[] returnInts = {(int)map.get(num),i};
                return returnInts;
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int aa[] = {2, 7, 11, 15};
        System.out.println(twoSum(aa,9));
    }
}
