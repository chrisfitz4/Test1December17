package com.example.test1.test;

public class PalindromeTester {

    public boolean checkPalindrome(String word){
        String reverse = "";
        for(int i = 0; i<word.length(); i++){
            reverse = word.charAt(i)+reverse;
        }
        return reverse.equals(word);
    }

    public static void main(String[] args){
        PalindromeTester pal = new PalindromeTester();
        System.out.println(pal.checkPalindrome("pop"));
        System.out.println(pal.checkPalindrome("plop"));
        System.out.println(pal.checkPalindrome("racecar"));
    }
}
