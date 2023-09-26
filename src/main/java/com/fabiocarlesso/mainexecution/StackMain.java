package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.stack.StackFunctions;
import com.fabiocarlesso.twopointers.TwoPointers;

public class StackMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";

    private StackMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void stackMain() {
        System.out.println("\n\nStack");
        isValidParentheses();
    }

    private static void isValidParentheses() {
        System.out.println("\nValid Parentheses");
        String parentheses = "()";
        System.out.println(ARRAY_TEXT + parentheses);
        System.out.println(RESULT_CASE_1 + StackFunctions.isValid(parentheses));
        parentheses = "()[]{}";
        System.out.println(ARRAY_TEXT + parentheses);
        System.out.println(RESULT_CASE_2 + StackFunctions.isValid(parentheses));
        parentheses = "(]";
        System.out.println(ARRAY_TEXT + parentheses);
        System.out.println(RESULT_CASE_3 + StackFunctions.isValid(parentheses));
    }

}
