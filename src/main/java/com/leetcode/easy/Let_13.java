package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Let_13 {
    public static void main(String[] args){
        String s = "MCMXCIV";
        method(s);
    }

    public static int method(String s){
        Map<Character, Integer> romanMap = new HashMap<>(7);
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i+1 < s.length()){
                if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i+1))){
                    sum += romanMap.get(s.charAt(i));
                }else {
                    sum += romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                    i = i + 1;
                }
            }else {
                sum += romanMap.get(s.charAt(i));
            }
        }
        return sum;
    }
}
