package LeetCode.Medium;

import java.util.*;

public class GroupAnagram {
    /*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

    Example 1:

    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

 */
    public static void main(String[] args) {
        String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramStrings = groupAnagram(str);
        for (List<String> group : anagramStrings) {
            for (String word : group) {
                System.out.print(word + ",");
            }
            System.out.println();
        }


    }

    private static List<List<String>> groupAnagram(String[] str){

        if(str.length ==0)
            return new ArrayList<>();

        Map<String,List<String>> sortMap = new HashMap<>();

        for(String i : str){
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);

            if(!sortMap.containsKey(sortedStr))
                sortMap.put(sortedStr,new ArrayList<>());

            sortMap.get(sortedStr).add(i);
        }

        return new ArrayList<>(sortMap.values());

    }
}
