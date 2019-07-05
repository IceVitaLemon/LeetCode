package com.leetcode.easy;

import java.util.ArrayList;

public class Let_28 {
    public static void main(String[] args){
        String testString = "hello";
        String pattern = "ll";
        Let_28 kmpSearch = new Let_28();
        System.out.println(kmpSearch.KMP(testString, pattern));
    }

    public int method(String hayStack, String needle){
        return hayStack.indexOf(needle);
    }

    public int KMP(String hayStack, String needle){
        int i = 0;
        int j = 0;
        ArrayList<Integer> next = GetNext(needle);
        while (i < hayStack.length() && j < needle.length()){
            if (j == -1 || hayStack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else {
                j = next.get(j);
            }
        }
        if (j == needle.length()){
            return i - j;
        }else {
            return -1;
        }
    }

    public ArrayList<Integer> GetNext(String pattern){
        int length = pattern.length();
        ArrayList<Integer> next = new ArrayList<>();
        next.add(-1);
        int k = -1;
        int j = 0;
        while (j < length-1){
            if (k==-1 || pattern.charAt(j) == pattern.charAt(k)){
                j++;
                k++;
                if (pattern.charAt(j) != pattern.charAt(k)){
                    next.add(k);
                }else {
                    next.add(next.get(k));
                }
            }else {
                k = next.get(k);
            }
        }
        return next;
    }
}
