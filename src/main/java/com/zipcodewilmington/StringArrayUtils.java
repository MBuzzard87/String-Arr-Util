package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if (array.length > 0) {
            return array[0];
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if (array.length > 1){
            return array[1];
        }
        return null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array.length > 0) {
            return array[array.length - 1];
        }

        return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if(array.length > 1) {
            return array[array.length - 2];
        }
         return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (String str : array) {
            if(str.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO

    public static String[] reverse(String[] array) {

        int revInt = array.length - 1;
        String[] revArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            revArr[revInt] = array[i];
            revInt--;
        }

        return revArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean isPalindrome = true;

        int palin = array.length - 1;

        for (String str : array) {
            if (!str.equals(array[palin])) {
                isPalindrome = false;
                break;
            }
            palin--;
        }

        return isPalindrome;

    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        boolean pangramic = true;
        String joinStr = String.join("", array).toLowerCase();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (String letter : alphabet) {
            if(!joinStr.contains(letter)) {
                pangramic = false;
                break;
            }
        }

        return pangramic;
    }




    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int numOccur = 0;
        for (String str : array) {
            if(str.equals(value)) {
                numOccur++;
            }
        }
        return numOccur;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        StringBuilder updatedStr = new StringBuilder();

        for(String str : array) {
            if(!str.equals(valueToRemove)) {
                updatedStr.append(str).append(" ");
            }
        }

        return updatedStr.toString().split(" ");
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        StringBuilder remStr = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || !array[i].equals(array[i - 1])) {
                remStr.append(array[i]).append(" ");
            }
        }

        return remStr.toString().split(" ");
    }
    //

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder packStr = new StringBuilder();
        packStr.append(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                packStr.append(array[i]);
            } else {
                packStr.append(" ").append(array[i]);
            }
        }


        return packStr.toString().split(" ");
    }
}
