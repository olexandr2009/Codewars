package com.codewars.phoneNumber;



public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number);
        }
        String format = "(%s) %s-%s";

        return format.formatted(
                sb.substring(0, 3),
                sb.substring(3, 6),
                sb.substring(6));
    }
}
