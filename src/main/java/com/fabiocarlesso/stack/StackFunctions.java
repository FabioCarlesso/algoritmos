package com.fabiocarlesso.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackFunctions {

    private StackFunctions() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);

        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bracketLookup.containsKey(c)) {
                if (!brackets.isEmpty() && bracketLookup.get(c).equals(brackets.peek())) {
                    brackets.pop();
                } else {
                    return false;
                }
            } else {
                brackets.push(c);
            }
        }

        return brackets.isEmpty();
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.add(stack.pop() + stack.pop());
                case "-" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.add(b - a);
                }
                case "*" -> stack.add(stack.pop() * stack.pop());
                case "/" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.add(b / a);
                }
                default -> stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

}
