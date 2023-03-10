package com.string.algorithms;

public class Main {
    public static boolean isUppercase (String str) {
        return str.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String str) {
        return str.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isPasswordComplex(String str) {
        return str.chars().anyMatch(Character::isUpperCase) && str.chars().anyMatch(Character::isUpperCase) && str.chars().anyMatch(Character::isDigit);
    }

    public static String normalizeString (String str) {
        return str.toLowerCase().trim().replace(",","");
    }

    public static void parseString (String str) {
        System.out.println("======================");
        System.out.println("Option 1");
        System.out.println("======================");
        for(char ch: str.toCharArray()) {
            System.out.println(ch);
        }

        System.out.println("======================");
        System.out.println("Option 2");
        System.out.println("======================");

        for (int i = 0; i < str.length(); i ++) {
            System.out.println(str.charAt(i));
        }
    }

    public static String reverseString (String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() -1; i >= 0 ;i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reversed2 (String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverseWord(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        String[] arr = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            result.append(reverseString(arr[i]));
            if(i < arr.length -1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "HELLO";
        System.out.println(str1 + " is uppercase ? => " + isUppercase(str1));
        System.out.println(str2 + " is uppercase ? => " + isUppercase(str2) );

        System.out.println(str1 + " is lowercase ? => " + isLowerCase(str1));
        System.out.println(str2 + " is lowercase ? => " + isLowerCase(str2) );

        String pwd1 = "Admin@123";
        System.out.println(pwd1 + " is a complex password? => " + isPasswordComplex(pwd1));

        String str3 = "Greeting From Java, Thank You.";
        System.out.println("Original => " + str3);
        System.out.println("Normalized => " + normalizeString(str3));

        System.out.println("Parse String");
        parseString(str2);

        System.out.println("Original => " + str2);
        System.out.println("Reversed => " + reverseString(str2));

        System.out.println("Original => " + str2);
        System.out.println("Reversed 2 => " + reversed2(str2));

        System.out.println("Original => " + str3);
        System.out.println("Reversed 2 => " + reverseWord(str3));
    }
}
