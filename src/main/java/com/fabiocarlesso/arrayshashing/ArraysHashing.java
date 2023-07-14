package com.fabiocarlesso.arrayshashing;

import java.util.*;

import static com.fabiocarlesso.mergesort.MergeSort.mergeSort;
import static com.fabiocarlesso.util.Utils.swap;

public class ArraysHashing {
    private ArraysHashing() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean containsArrayIntDuplicate(int[] numbers){
        return Arrays.stream(numbers)
                .distinct()
                .count() < numbers.length;
    }

    public static boolean isAnagram(String word, String anagramWord){
        if (word.length() != anagramWord.length()) {
            return false;
        }

        char[] wordChars = word.toCharArray();
        char[] anagramWordChars = anagramWord.toCharArray();

        Arrays.sort(wordChars);
        Arrays.sort(anagramWordChars);

        return Arrays.equals(wordChars, anagramWordChars);
    }

    public static int[] getArrayIntConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static int[] replaceElementsOnRightSideFromArrayInt(int[] arr) {
        int n = arr.length;
        int max = -1;

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        int lastIndex = s.length() - 1;
        while (lastIndex >= 0 && s.charAt(lastIndex) != ' ') {
            length++;
            lastIndex--;
        }
        return length;
    }

    public static int[] twoSumArrayInt(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(numbers[i], i);
        }

        return new int[0];
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            for(String s: strs)
                if(i == s.length() || s.charAt(i) != strs[0].charAt(i))
                    return res.toString();
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
            String key = Arrays.toString(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }

    public static void sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j>=1 && res.get(i-1).size()-1>=j){
                    list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                } else{
                    list.add(1);
                }
            }
            res.add(list);
        }
        return res;
    }

    public static int removeElement(int[] nums, int val) {
        int boundary = nums.length - 1;
        int i = 0;
        while (i <= boundary) {
            if (nums[i] == val) {
                swap(nums, i, boundary);
                boundary -= 1;
            } else {
                i += 1;
            }
        }
        return i;
    }

    private static String getFormattedEmail(String email) {
        String[] arr = email.split("@");
        String localName = arr[0];
        String domainName = arr[1];
        String[] arrLocalWithPlus = localName.split("\\+");
        localName = arrLocalWithPlus[0];
        localName = localName.replace(".", "");
        return localName + "@" + domainName;
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String email: emails) {
            String formattedEmail = getFormattedEmail(email);
            uniqueEmails.add(formattedEmail);
        }
        return uniqueEmails.size();
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        int s1=0;
        int t1=0;

        while(s1 < s.length() && t1 < t.length()){
            if((mapS.containsKey(s.charAt(s1)) && mapS.get(s.charAt(s1)) != t.charAt(t1)) ||
                    (mapT.containsKey(t.charAt(t1)) && mapT.get(t.charAt(t1)) != s.charAt(s1))){
                return false;
            }
            mapS.put(s.charAt(s1), t.charAt(t1));
            mapT.put(t.charAt(t1), s.charAt(s1));
            s1 += 1;
            t1 += 1;
        }
        return true;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        if(n==0) return true;
        for(int i=0; i<size; i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==size-1 || flowerbed[i+1]==0)){
                n--;
                if(n==0) return true;
                flowerbed[i]=1;
            }
        }
        return false;
    }

    public static int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;

        for(int n: nums) {
            if(count == 0)
                res = n;
            count += (n == res? 1: -1);
        }

        return res;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int counter=0;
        for(int i: nums1)
            res[counter++]=ans(i, nums2);
        return res;
    }

    private static int ans(int i, int[] nums){
        for(int n=0; n<nums.length; n++){
            if(nums[n]==i){
                for(int j=n+1; j<nums.length; j++){
                    if(nums[j]>i)
                        return nums[j];
                }
            }
        }
        return -1;
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
                i--;
            }
        }
        for (int i = 0; i < nums.length; i++)
            if (nums[i] - 1 != i) list.add(i + 1);
        return list;
    }

    public static int maxNumberOfBalloons(String text, String instancesWord) {
        HashMap<Character, Integer> balloon = new HashMap<>();
        HashMap<Character, Integer> countText = new HashMap<>();

        char[] balloonArray = instancesWord.toCharArray();

        for (char c : balloonArray) {
            if (balloon.containsKey(c)) {
                balloon.put(c,balloon.get(c)+1);
            } else {
                balloon.put(c,1);
            }
        }

        char[] countTextArray = text.toCharArray();

        for (char c : countTextArray) {
            if (countText.containsKey(c)) {
                countText.put(c,countText.get(c)+1);
            } else {
                countText.put(c,1);
            }
        }

        int res = text.length();
        for (Character c : balloon.keySet()) {
            res = Math.min(res,countText.getOrDefault(c,0) / balloon.get(c));
        }

        return res;
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");
        if(sArray.length != pattern.length()) {
            return false;
        }

        HashMap<Character,String> charToWord = new HashMap<>();
        HashMap<String,Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if(charToWord.containsKey(pattern.charAt(i)) && !charToWord.get(pattern.charAt(i)).equals(sArray[i]))
                return false;

            if(wordToChar.containsKey(sArray[i]) && !wordToChar.get(sArray[i]).equals(pattern.charAt(i)))
                return false;

            charToWord.put(pattern.charAt(i),sArray[i]);
            wordToChar.put(sArray[i],pattern.charAt(i));
        }
        return true;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty())
            arr[--i] = pq.poll().getKey();
        return arr;
    }

}
