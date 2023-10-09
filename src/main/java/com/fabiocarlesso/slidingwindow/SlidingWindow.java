package com.fabiocarlesso.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {

    private SlidingWindow(){
        throw new IllegalStateException("Utility class");
    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Character> substringL = new ArrayList<>();
        int largestlength = 0;
        for(int right = 0; right < s.length(); right++) {
            if(substringL.contains(s.charAt(right))) {
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if(index > 0)
                    substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            largestlength = Math.max(largestlength, substringL.size());
        }
        return largestlength;
    }

}
