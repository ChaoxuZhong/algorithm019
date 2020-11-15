package com.chaoxuzhong.study.algorithm.week02_02_GroupAnagrams;

//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
//
// 示例:
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]
//
// 说明：
//
//
// 所有输入均为小写字母。
// 不考虑答案输出的顺序。
//
// Related Topics 哈希表 字符串
// 👍 518 👎 0


import com.alibaba.excel.util.StringUtils;

import java.util.*;

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String[] strs) {
        if (StringUtils.isEmpty(strs)) {
            return new ArrayList<>();
        }
        Map<String,List> map = new HashMap<String,List>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
    
}
