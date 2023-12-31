package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.arrayshashing.ArraysHashing;
import com.fabiocarlesso.arrayshashing.Codec;
import com.fabiocarlesso.arrayshashing.NumArray;
import com.fabiocarlesso.arrayshashing.RandomizedSet;
import com.fabiocarlesso.util.Utils;

import java.util.Arrays;

public class ArraysHashingMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";

    private ArraysHashingMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void arraysHashingMain() {
        System.out.println("\n\nArrays Hashing");
        arrayIntContainsDuplicateMain();
        isAnagramMain();
        getArrayIntConcatenationMain();
        replaceElementsOnRightSideFromArrayIntMain();
        isSubsequenceMain();
        lengthOfLastWordMain();
        twoSumArrayIntMain();
        longestCommonPrefixMain();
        groupAnagramsMain();
        sortArrayMain();
        generatePascalTriangleMain();
        removeElementMain();
        uniqueEmailAddressesMain();
        isIsomorphicMain();
        canPlaceFlowersMain();
        majorityElementMain();
        nextGreaterElementMain();
        pivotIndexMain();
        rangeSumQueryMain();
        findDisappearedNumbersMain();
        maxNumberOfBalloonsMain();
        wordPatternMain();
        topKFrequentMain();
        productExceptSelfMain();
        longestConsecutiveSequenceMain();
        sortColorsMain(); //semelhante ao sortArray
        encodeDecodeTinyURLMain();
        maxProfitMain();
        subarraySumEqualsKMain();
        minSwapsStringBalancedMain();
        interchangeableRectanglesMain();
        findAnagramsMain(); //poderia ter utilizado o isAnagram com groupAnagrams para simplicaficar a logica
        largestNumberMain();
        checkSubarraySumMain(); //poderia ter utilizado o subarraySum para simplificar a logica
        findRepeatedDnaSequencesMain();
        randomizedSetMain();
        firstMissingPositiveMain(); //melhorar legibilidade
        checkPossibilityMain();
    }

    private static void isAnagramMain() {
        System.out.println("\n\nIs Anagram");
        String word = "alert";
        String anagram = "later";
        System.out.println("Word: " + word);
        System.out.println("Anagram: " + anagram);
        System.out.println("Is anagram: " + ArraysHashing.isAnagram(word, anagram));

        String wordRat = "rat";
        String anagramCar = "car";
        System.out.println("\nWord: " + wordRat);
        System.out.println("Anagram: " + anagramCar);
        System.out.println("Is anagram: " + ArraysHashing.isAnagram(wordRat, anagramCar));
    }

    private static void arrayIntContainsDuplicateMain() {
        System.out.println("\n\nArray Int Contains Duplicate");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println("No duplicates: " + ArraysHashing.containsArrayIntDuplicate(numbers));

        int[] numbersWithDuplicate = {1, 2, 3, 2, 4, 5};
        System.out.println("\n" + ARRAY_TEXT + Arrays.toString(numbersWithDuplicate));
        System.out.println("Contains Duplicate: " + ArraysHashing.containsArrayIntDuplicate(numbersWithDuplicate));
    }

    private static void getArrayIntConcatenationMain() {
        System.out.println("\n\nArray Int Concatenation");
        int[] nums = {1, 2, 3};
        int[] concatenated = ArraysHashing.getArrayIntConcatenation(nums);

        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("Concatenation: " + Arrays.toString(concatenated));

    }

    private static void replaceElementsOnRightSideFromArrayIntMain() {
        System.out.println("\n\nArray Int Replace Elements On Right Side");
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(ARRAY_TEXT + Arrays.toString(arr));
        int[] replaced = ArraysHashing.replaceElementsOnRightSideFromArrayInt(arr);
                System.out.println("Replace Elements: " + Arrays.toString(replaced));

        int[] arrTest = {400};
        System.out.println("\n" + ARRAY_TEXT + Arrays.toString(arrTest));
        int[] replacedError = ArraysHashing.replaceElementsOnRightSideFromArrayInt(arrTest);
        System.out.println("Replace Elements error: " + Arrays.toString(replacedError));
    }

    private static void isSubsequenceMain() {
        System.out.println("\n\nIs Subsequence");
        String subSequence = "ace";
        String sequence = "abcde";
        System.out.println("Subsequence: " + subSequence);
        System.out.println("Sequence: " + sequence);
        System.out.println("Is Subsequence: " + ArraysHashing.isSubsequence(subSequence, sequence));

        String subSequenceFalse = "aec";
        System.out.println("Subsequence: " + subSequenceFalse);
        System.out.println("Sequence: " + sequence);
        System.out.println("Is Subsequence: " + ArraysHashing.isSubsequence(subSequenceFalse, sequence));
    }

    private static void lengthOfLastWordMain() {
        System.out.println("\n\nLength Of Last Word");
        String phrase = "Hello World";
        String phrase2 = "   Java Programming   ";
        String phrase3 = "   fly me   to   the moon  ";
        System.out.println("Phrase 1: " + phrase);
        System.out.println("Length Of Last Word 1: " + ArraysHashing.lengthOfLastWord(phrase));
        System.out.println("Phrase 2: " + phrase2);
        System.out.println("Length Of Last Word 2: " + ArraysHashing.lengthOfLastWord(phrase2));
        System.out.println("Phrase 3: " + phrase3);
        System.out.println("Length Of Last Word 3: " + ArraysHashing.lengthOfLastWord(phrase3));
    }

    private static void twoSumArrayIntMain() {
        System.out.println("\n\nTwo Sum Array Int");
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ArraysHashing.twoSumArrayInt(nums, target);
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("Target 1: " + target);
        System.out.println("Indices 1: " + result[0] + ", " + result[1]);

        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        int target2 = 6;
        int[] result2 = ArraysHashing.twoSumArrayInt(nums2, target2);
        System.out.println("\n"+ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println("Target 2: " + target2);
        System.out.println("Indices 2: " + result2[0] + ", " + result2[1]);
        int[] result3 = ArraysHashing.twoSumArrayInt(nums3, target2);
        System.out.println("\n"+ARRAY_TEXT + Arrays.toString(nums3));
        System.out.println("Target 3: " + target2);
        System.out.println("Indices 3: " + result3[0] + ", " + result3[1]);
    }

    private static void longestCommonPrefixMain() {
        System.out.println("\n\nLongest Common Prefix");
        String[] strs = {"flower","flow","flight"};
        System.out.println(ARRAY_TEXT + Arrays.toString(strs));
        System.out.println("Longest Common Prefix case 1: " + ArraysHashing.longestCommonPrefix(strs));
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(ARRAY_TEXT + Arrays.toString(strs2));
        System.out.println("Longest Common Prefix case 2: " + ArraysHashing.longestCommonPrefix(strs2));
    }

    private static void groupAnagramsMain() {
        System.out.println("\n\nGroup Anagrams");
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(ARRAY_TEXT + Arrays.toString(strs));
        System.out.println("Group Anagrams case 1: " + ArraysHashing.groupAnagrams(strs));
        String[] strs2 = {""};
        System.out.println(ARRAY_TEXT + Arrays.toString(strs2));
        System.out.println("Group Anagrams case 2: " + ArraysHashing.groupAnagrams(strs2));
    }

    private static void sortArrayMain() {
        System.out.println("\n\nSort Array");
        int[] nums = {5,2,3,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        ArraysHashing.sortArray(nums);
        System.out.println(RESULT_CASE_1 + Arrays.toString(nums));

        int[] nums2 = {5,1,1,2,0,0};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        ArraysHashing.sortArray(nums2);
        System.out.println(RESULT_CASE_2 + Arrays.toString(nums2));
    }

    private static void generatePascalTriangleMain() {
        System.out.println("\n\nGenerate Pascal Triangle");
        int nums = 5;
        System.out.println("Rows: "+nums);
        System.out.println(RESULT_CASE_1 + ArraysHashing.generatePascalTriangle(nums));

        nums = 1;
        System.out.println("Rows: "+nums);
        System.out.println(RESULT_CASE_2 + ArraysHashing.generatePascalTriangle(nums));
    }

    private static void removeElementMain() {
        System.out.println("\n\nRemove Element");
        int[] nums = {3,2,2,3};
        int removeElement = 3;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("Remove element: " + removeElement);
        int target = ArraysHashing.removeElement(nums, removeElement);
        System.out.println(RESULT_CASE_1 + Utils.intArrayToStringTarget(nums, target));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        removeElement = 2;
        System.out.println("\n"+ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println("Remove element: " + removeElement);
        target = ArraysHashing.removeElement(nums2, removeElement);
        System.out.println(RESULT_CASE_2 + Utils.intArrayToStringTarget(nums2, target));
    }

    private static void uniqueEmailAddressesMain() {
        System.out.println("\n\nNumber of Unique Email Addresses");
        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        };
        System.out.println(ARRAY_TEXT + Arrays.toString(emails));
        System.out.println(RESULT_CASE_1 + ArraysHashing.numUniqueEmails(emails));

        String[] emailsCase2 = {
                "a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"
        };
        System.out.println(ARRAY_TEXT + Arrays.toString(emailsCase2));
        System.out.println(RESULT_CASE_2 + ArraysHashing.numUniqueEmails(emailsCase2));
    }

    private static void isIsomorphicMain() {
        System.out.println("\n\nIs Isomorphic");
        String firstWord = "egg";
        String secondWord = "add";
        String wordsTxt = "Words: ";
        String andTxt = " and ";
        System.out.println(wordsTxt + firstWord + andTxt + secondWord);
        System.out.println(RESULT_CASE_1 + ArraysHashing.isIsomorphic(firstWord, secondWord));

        firstWord = "foo";
        secondWord = "bar";
        System.out.println(wordsTxt + firstWord + andTxt + secondWord);
        System.out.println(RESULT_CASE_2 + ArraysHashing.isIsomorphic(firstWord, secondWord));

        firstWord = "paper";
        secondWord = "title";
        System.out.println(wordsTxt + firstWord + andTxt + secondWord);
        System.out.println(RESULT_CASE_3 + ArraysHashing.isIsomorphic(firstWord, secondWord));
    }

    private static void canPlaceFlowersMain() {
        System.out.println("\n\nCan Place Flowers");
        int[] flowerBed = {1,0,0,0,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(flowerBed));
        int newFlowersCanBePlanted = 1;
        System.out.println("New Flowers Can Be Planted: "+newFlowersCanBePlanted);
        System.out.println(RESULT_CASE_1 + ArraysHashing.canPlaceFlowers(flowerBed, newFlowersCanBePlanted));
        newFlowersCanBePlanted = 2;
        System.out.println("New Flowers Can Be Planted: "+newFlowersCanBePlanted);
        System.out.println(RESULT_CASE_2 + ArraysHashing.canPlaceFlowers(flowerBed, newFlowersCanBePlanted));
    }

    private static void majorityElementMain() {
        System.out.println("\n\nMajority Element");
        int[] nums = {3,2,3};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + ArraysHashing.majorityElement(nums));
        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println(RESULT_CASE_2 + ArraysHashing.majorityElement(nums2));
    }

    private static void nextGreaterElementMain() {
        System.out.println("\n\nNext Greater Element");
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums1));
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println(RESULT_CASE_1 + Arrays.toString(ArraysHashing.nextGreaterElement(nums1, nums2)));

        nums1 = new int[]{2,4};
        nums2 = new int[]{1,2,3,4};
        System.out.println("\n"+ARRAY_TEXT + Arrays.toString(nums1));
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println(RESULT_CASE_2 + Arrays.toString(ArraysHashing.nextGreaterElement(nums1, nums2)));
    }

    private static void pivotIndexMain() {
        System.out.println("\n\nPivot Index");
        int[] nums = {1,7,3,6,5,6};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + ArraysHashing.pivotIndex(nums));

        nums = new int[]{1,2,3};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + ArraysHashing.pivotIndex(nums));

        nums = new int[]{2,1,-1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_3 + ArraysHashing.pivotIndex(nums));
    }

    private static void rangeSumQueryMain() {
        System.out.println("\n\nRange Sum Query - Immutable");
        int[] nums = {-2, 0, 3, -5, 2, -1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        NumArray numArray = new NumArray(nums);
        System.out.println(RESULT_CASE_1 + numArray.sumRange(0,2));
        System.out.println(RESULT_CASE_2 + numArray.sumRange(2,5));
        System.out.println(RESULT_CASE_3 + numArray.sumRange(0,5));
    }

    private static void findDisappearedNumbersMain() {
        System.out.println("\n\nFind All Numbers Disappeared in an Array");
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + ArraysHashing.findDisappearedNumbers(nums));
        nums = new int[]{1,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + ArraysHashing.findDisappearedNumbers(nums));
    }

    private static void maxNumberOfBalloonsMain() {
        System.out.println("\n\nMaximum Number of Balloons");
        String firstWord = "nlaebolko";
        System.out.println(ARRAY_TEXT + firstWord);
        String balloon = "balloon";
        System.out.println(RESULT_CASE_1 + ArraysHashing.maxNumberOfBalloons(firstWord, balloon));
        String secondWord = "loonbalxballpoon";
        System.out.println(ARRAY_TEXT + secondWord);
        System.out.println(RESULT_CASE_2 + ArraysHashing.maxNumberOfBalloons(secondWord, balloon));
        String thirdWord = "leetcode";
        System.out.println(ARRAY_TEXT + thirdWord);
        System.out.println(RESULT_CASE_3 + ArraysHashing.maxNumberOfBalloons(thirdWord, balloon));
        String fourthWord = "tesdsadsatdasdsasdtesdassdadstfdaadsdasdastest";
        System.out.println(ARRAY_TEXT + fourthWord);
        System.out.println(RESULT_CASE_3 + ArraysHashing.maxNumberOfBalloons(fourthWord, "test"));
    }

    private static void wordPatternMain() {
        System.out.println("\n\nWord Pattern");
        String pattern = "abba";
        String words = "dog cat cat dog";
        System.out.println(ARRAY_TEXT + words);
        String patternText = "Pattern: ";
        System.out.println(patternText + pattern);
        System.out.println(RESULT_CASE_1 + ArraysHashing.wordPattern(pattern, words));
        words = "dog cat cat fish";
        System.out.println(ARRAY_TEXT + words);
        System.out.println(patternText + pattern);
        System.out.println(RESULT_CASE_2 + ArraysHashing.wordPattern(pattern, words));
        pattern = "aaaa";
        words = "dog cat cat dog";
        System.out.println(ARRAY_TEXT + words);
        System.out.println(patternText + pattern);
        System.out.println(RESULT_CASE_3 + ArraysHashing.wordPattern(pattern, words));
    }

    private static void topKFrequentMain() {
        System.out.println("\n\nTop K Frequent Elements");
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_1 + Arrays.toString(ArraysHashing.topKFrequent(nums, k)));
        nums = new int[] {1};
        k = 1;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_2 + Arrays.toString(ArraysHashing.topKFrequent(nums, k)));
    }

    private static void productExceptSelfMain() {
        System.out.println("\n\nProduct of Array Except Self\n");
        int[] nums = {1,2,3,4};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + Arrays.toString(ArraysHashing.productExceptSelf(nums)));
        nums = new int[] {-1,1,0,-3,3};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + Arrays.toString(ArraysHashing.productExceptSelf(nums)));
    }

    private static void longestConsecutiveSequenceMain() {
        System.out.println("\n\nLongest Consecutive Sequence\n");
        int[] nums = {100,4,200,1,3,2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + ArraysHashing.longestConsecutive(nums));
        nums = new int[] {0,3,7,2,5,8,4,6,0,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + ArraysHashing.longestConsecutive(nums));
    }

    private static void sortColorsMain() {
        System.out.println("\n\nSort Colors\n\n");
        int[] nums = {2,0,2,1,1,0};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        ArraysHashing.sortColors(nums);
        System.out.println(RESULT_CASE_1 + Arrays.toString(nums));
        nums = new int[] {2,0,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        ArraysHashing.sortColors(nums);
        System.out.println(RESULT_CASE_2 + Arrays.toString(nums));
    }

    private static void encodeDecodeTinyURLMain() {
        System.out.println("\n\nEncode and Decode TinyURL\n\n");
        String url = "https://leetcode.com/problems/design-tinyurl";
        Codec codec = new Codec();
        codec.decode(codec.encode(url));
        System.out.println(ARRAY_TEXT + url);
        System.out.println("Encode: http://t.u/" + codec.encode(url));
        System.out.println(RESULT_CASE_1 + codec.decode(codec.encode(url)));
    }

    private static void maxProfitMain() {
        System.out.println("\n\nBest Time to Buy and Sell Stock II - Max Profit\n\n");
        int[] prices = {7,1,5,3,6,4};
        System.out.println(ARRAY_TEXT + Arrays.toString(prices));
        System.out.println(RESULT_CASE_1 + ArraysHashing.maxProfit(prices));
        prices = new int[] {1,2,3,4,5};
        System.out.println(ARRAY_TEXT + Arrays.toString(prices));
        System.out.println(RESULT_CASE_2 + ArraysHashing.maxProfit(prices));
        prices = new int[] {7,6,4,3,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(prices));
        System.out.println(RESULT_CASE_2 + ArraysHashing.maxProfit(prices));
    }

    private static void subarraySumEqualsKMain() {
        System.out.println("\n\nSubarray Sum Equals K\n");
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_1 + ArraysHashing.subarraySum(nums, k));
        nums = new int[] {1,2,3};
        k = 3;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_2 + ArraysHashing.subarraySum(nums, k));
    }

    private static void minSwapsStringBalancedMain() {
        System.out.println("\n\nMinimum Number of Swaps to Make the String Balanced");
        String brackets = "][][";
        System.out.println(ARRAY_TEXT + brackets);
        System.out.println(RESULT_CASE_1 + ArraysHashing.minSwaps(brackets));
        brackets = "]]][[[";
        System.out.println(ARRAY_TEXT + brackets);
        System.out.println(RESULT_CASE_2 + ArraysHashing.minSwaps(brackets));
        brackets = "[]";
        System.out.println(ARRAY_TEXT + brackets);
        System.out.println(RESULT_CASE_2 + ArraysHashing.minSwaps(brackets));
    }

    private static void interchangeableRectanglesMain() {
        System.out.println("\n\nNumber of Pairs of Interchangeable Rectangles");
        int[][] rectangles = {{4,8}, {3,6},{10,20},{15,30}};
        System.out.println(ARRAY_TEXT + Arrays.deepToString(rectangles));
        System.out.println(RESULT_CASE_1 + ArraysHashing.interchangeableRectangles(rectangles));
        rectangles = new int[][]{{4, 5}, {7, 8}};
        System.out.println(ARRAY_TEXT + Arrays.deepToString(rectangles));
        System.out.println(RESULT_CASE_1 + ArraysHashing.interchangeableRectangles(rectangles));
    }

    private static void findAnagramsMain() {
        System.out.println("\n\nFind All Anagrams in a String");
        String word = "cbaebabacd";
        String pattern = "abc";
        System.out.println(ARRAY_TEXT + word);
        String patternText = "Pattern: ";
        System.out.println(patternText + pattern);
        System.out.println(RESULT_CASE_1 + ArraysHashing.findAnagrams(word, pattern));
        word = "abab";
        pattern = "ab";
        System.out.println(ARRAY_TEXT + word);
        System.out.println(patternText + pattern);
        System.out.println(RESULT_CASE_2 + ArraysHashing.findAnagrams(word, pattern));
    }

    private static void largestNumberMain() {
        System.out.println("\n\nLargest Number");
        int[] nums = {10,2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + ArraysHashing.largestNumber(nums));
        nums = new int[] {3,30,34,5,9};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + ArraysHashing.largestNumber(nums));
    }

    private static void checkSubarraySumMain() {
        System.out.println("\n\nContinuous Subarray Sum");
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_1 + ArraysHashing.checkSubarraySum(nums, k));
        nums = new int[] {23,2,6,4,7};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_2 + ArraysHashing.checkSubarraySum(nums, k));
        nums = new int[] {23,2,6,4,7};
        k = 13;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_3 + ArraysHashing.checkSubarraySum(nums, k));
    }

    private static void findRepeatedDnaSequencesMain() {
        System.out.println("\n\nRepeated DNA Sequences");
        String dna = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(ARRAY_TEXT + dna);
        System.out.println(RESULT_CASE_1 + ArraysHashing.findRepeatedDnaSequences(dna));
        dna = "AAAAAAAAAAAAA";
        System.out.println(ARRAY_TEXT + dna);
        System.out.println(RESULT_CASE_2 + ArraysHashing.findRepeatedDnaSequences(dna));
        dna = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTTAAAACCCGTGTGTGTGTTAAAAACCCCCAAAAACCCCCCAAAAA";
        System.out.println(ARRAY_TEXT + dna);
        System.out.println(RESULT_CASE_3 + ArraysHashing.findRepeatedDnaSequences(dna));
    }

    private static void randomizedSetMain() {
        System.out.println("\n\nInsert Delete GetRandom O(1)");
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(RESULT_CASE_1);
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(ARRAY_TEXT + randomizedSet.getNumbers());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(ARRAY_TEXT + randomizedSet.getNumbers());
    }

    private static void firstMissingPositiveMain() {
        System.out.println("\n\nFirst Missing Positive");
        int[] nums = {1,2,0};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + ArraysHashing.firstMissingPositive(nums));
        nums = new int[]{3,4,-1,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + ArraysHashing.firstMissingPositive(nums));
        nums = new int[]{7,8,9,11,12};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_3 + ArraysHashing.firstMissingPositive(nums));
    }

    private static void checkPossibilityMain() {
        System.out.println("\n\nNon-decreasing Array");
        int[] nums = {4,2,3};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + ArraysHashing.checkPossibility(nums));
        nums = new int[]{4,2,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + ArraysHashing.checkPossibility(nums));
    }

}
