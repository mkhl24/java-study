package com.mkhl24;

public class Utilities {

    // returns a char array containing every n-th char
    // when sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n) {
        if(sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }
        int returnLength = sourceArray.length / n;
        char[] result = new char[returnLength];
        int index = 0;

        for (int i = n-1; i< sourceArray.length; i+=n) {
            result[index++] = sourceArray[i];
        }
        return result;
    }

    // removes pairs of the same charecter that are next
    // to each other, by removing on e occurrences of character
    // "AABCDEEF" -> "ABCDEF"
    // "ABCBDEEF" -> "ABCDBEF"
    public String removePairs(String source) {
        // if length is less than 2, there won't be any pairs
        if(source == null || source.length() < 2) {
            return source;
        }
        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i=0; i<string.length - 1; i++) {
//            System.out.println(string[i]);
            if(string[i] != string[i+1]) {
                sb.append(string[i]);
            }
        }
//        System.out.println(string[string.length - 1]);
        sb.append(string[string.length - 1]);
        return sb.toString();
    }

    // perfoms a conversion based on some internal business rule
    public int converter(int a, int b) {
        return (a/b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if(source.length() % 2 == 0) {
            return source;
        }
        return null;
    }
}