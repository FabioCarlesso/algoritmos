package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.stack.GenerateParenthesisStack;
import com.fabiocarlesso.stack.MinStack;
import com.fabiocarlesso.stack.StackFunctions;

import java.util.Arrays;

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
        evalRPN();
        generateParenthesisStack();
        dailyTemperaturesMain();
        carFleetMain();
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

    private static void evalRPN() {
        System.out.println("\nEvaluate Reverse Polish Notation");
        String[] tokens = new String[]{"2","1","+","3","*"};
        System.out.println(ARRAY_TEXT + Arrays.toString(tokens));
        System.out.println(RESULT_CASE_1 + StackFunctions.evalRPN(tokens));
        tokens = new String[]{"4","13","5","/","+"};
        System.out.println(ARRAY_TEXT + Arrays.toString(tokens));
        System.out.println(RESULT_CASE_2 + StackFunctions.evalRPN(tokens));
        tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(ARRAY_TEXT + Arrays.toString(tokens));
        System.out.println(RESULT_CASE_3 + StackFunctions.evalRPN(tokens));
    }

    private static void generateParenthesisStack() {
        System.out.println("\nGenerate Parentheses");
        GenerateParenthesisStack parenthesis = new GenerateParenthesisStack();
        int n = 3;
        System.out.println(ARRAY_TEXT + n);
        System.out.println(RESULT_CASE_1 + parenthesis.generateParenthesis(n));
        n = 1;
        System.out.println(ARRAY_TEXT + n);
        System.out.println(RESULT_CASE_2 + parenthesis.generateParenthesis(n));
    }

    private static void dailyTemperaturesMain() {
        System.out.println("\nDaily Temperatures");
        int[] temperatures = new int[]{73,74,75,71,69,72,76,73};
        System.out.println(ARRAY_TEXT + Arrays.toString(temperatures));
        System.out.println(RESULT_CASE_1 + Arrays.toString(StackFunctions.dailyTemperatures(temperatures)));
        temperatures = new int[]{30,40,50,60};
        System.out.println(ARRAY_TEXT + Arrays.toString(temperatures));
        System.out.println(RESULT_CASE_2 + Arrays.toString(StackFunctions.dailyTemperatures(temperatures)));
        temperatures = new int[]{30,60,90};
        System.out.println(ARRAY_TEXT + Arrays.toString(temperatures));
        System.out.println(RESULT_CASE_3 + Arrays.toString(StackFunctions.dailyTemperatures(temperatures)));
    }

    private static void carFleetMain() {
        System.out.println("\nCar Fleet");
        String targetString = "Target: ";
        String positionString = "Position: ";
        String speedString = "Speed: ";

        int target = 12;
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};
        System.out.println(targetString + target);
        System.out.println(positionString + Arrays.toString(position));
        System.out.println(speedString + Arrays.toString(speed));
        System.out.println(RESULT_CASE_1 + StackFunctions.carFleet(target, position, speed));

        target = 10;
        position = new int[]{3};
        speed = new int[]{3};
        System.out.println(targetString + target);
        System.out.println(positionString + Arrays.toString(position));
        System.out.println(speedString + Arrays.toString(speed));
        System.out.println(RESULT_CASE_2 + StackFunctions.carFleet(target, position, speed));

        target = 100;
        position = new int[]{0,2,4};
        speed = new int[]{4,2,1};
        System.out.println(targetString + target);
        System.out.println(positionString + Arrays.toString(position));
        System.out.println(speedString + Arrays.toString(speed));
        System.out.println(RESULT_CASE_3 + StackFunctions.carFleet(target, position, speed));
    }

}
