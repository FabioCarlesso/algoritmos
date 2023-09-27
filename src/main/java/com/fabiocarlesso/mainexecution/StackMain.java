package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.stack.MinStack;
import com.fabiocarlesso.stack.StackFunctions;

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
        minStack();
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

    private static void minStack() {
        System.out.println("\nMin Stack");

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(ARRAY_TEXT + minStack.toString());

        int minStackResult1 = minStack.getMin();
        System.out.println(RESULT_CASE_1 + minStackResult1);

        minStack.pop();
        System.out.println(ARRAY_TEXT + minStack.toString());

        int minStackResult2 = minStack.top();
        System.out.println(RESULT_CASE_2 + minStackResult2);

        int minStackResult3 = minStack.getMin();
        System.out.println(RESULT_CASE_3 + minStackResult3);
    }

}
