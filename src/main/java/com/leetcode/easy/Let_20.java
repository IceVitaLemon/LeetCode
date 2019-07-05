package com.leetcode.easy;

import java.util.*;

public class Let_20 {
    public static void main(String[] args){
        String str = "([)]";
        method(str);
    }

    public static boolean method(String s){
        Map<Character, Integer> map = new HashMap<>(6);
        map.put('(', 1);
        map.put(')', 2);
        map.put('[', 3);
        map.put(']', 4);
        map.put('{', 5);
        map.put('}', 6);
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!stack.empty() && stack.peek() != null){
                if (map.get(stack.peek())+1 == map.get(chars[i])){
                    stack.pop();
                }else if (map.get(chars[i])%2 == 1){
                    stack.push(chars[i]);
                }else {
                    return false;
                }
            }else {
                if (map.get(chars[i])%2 == 1){
                    stack.push(chars[i]);
                }else {
                    return false;
                }
            }
        }
        if (stack.empty()){
            return true;
        }else {
            return false;
        }
    }
}
