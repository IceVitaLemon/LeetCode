package com.leetcode.easy;

public class Let_9 {
    public static void main(String[] args){
        int x = 0;
        System.out.print(methodWithString(x));
    }

    public static boolean methodWithString(int x){
        String stringX = String.valueOf(x);
        boolean flag = true;
        int i = 0;
        int j = stringX.length() - 1;
        while (i < j){
            if (stringX.charAt(i) != stringX.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }

    public static boolean methodWithInt(int x){
        if (x < 0) {
            return false;
        }

        int div = 1;
        while (x / div >= 10){
            div *= 10;
        }
        while (x > 0){
            int left = x / div;
            int right = x % 10;
            if (left != right){
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
