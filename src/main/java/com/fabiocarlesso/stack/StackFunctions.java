package com.fabiocarlesso.stack;

import java.util.Arrays;
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

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int currDay = 0; currDay < temperatures.length; currDay++) {
            while ( !stack.isEmpty() && temperatures[currDay] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                ans[prevDay] = currDay - prevDay;
            }
            stack.add(currDay);
        }
        return ans;
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1) return 1;
        Stack<Double> stack = new Stack<>();
        int[][] combine = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }

        Arrays.sort(combine, java.util.Comparator.comparingInt(o -> o[0]));
        for (int i = combine.length - 1; i >= 0; i--) {
            double currentTime = (double) (target - combine[i][0]) /
                    combine[i][1];
            if ( !(!stack.isEmpty() && currentTime <= stack.peek()) ) {
                stack.push(currentTime);
            }
        }
        return stack.size();
    }

    public static int largestRectangleArea(int[] heights) {
        int area = 0;
        int n = heights.length;
        int start;
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        for(int i=0;i<heights.length;i++){
            int curHt =heights[i];
            start = i;
            while(!stack.isEmpty() && stack.peek().value() > curHt){
                Pair<Integer,Integer> pair = stack.pop();
                int index = pair.key();
                int h = pair.value();
                area = Math.max(area, h * (i - index));
                start = index;
            }
            stack.push(new Pair<>(start,curHt));
        }

        while(!stack.isEmpty()){
            Pair<Integer,Integer> pair = stack.pop();
            int index = pair.key();
            int h = pair.value();
            area = Math.max(area, h * (n - index));
        }
        return area;
    }

}
