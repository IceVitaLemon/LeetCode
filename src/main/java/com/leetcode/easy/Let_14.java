package com.leetcode.easy;

public class Let_14 {
    public static void main(String[] args){
        String[] strs = {"c", "c"};
        System.out.println("c".substring(0, 1));
        method(strs);
    }

    public static String method(String[] strs){
        if (strs.length == 0) {
            return "";
        }
        if (strs.length < 2){
            return strs[0];
        }

        int arrayLength = strs.length;
        int minStringLength = Integer.MAX_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            minStringLength = minStringLength > strs[i].length() ? strs[i].length() : minStringLength;
        }
        int i = 0;
        boolean flag = false;
        for (; i < minStringLength; i++) {
            for (int j = 1; j < arrayLength; j++) {
                if (strs[j-1].charAt(i) != strs[j].charAt(i)){
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        if (strs[0].isEmpty()){
            return strs[0];
        }else {
            return strs[0].substring(0, i);
        }

    }
}
