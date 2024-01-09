package problems;

import java.util.Arrays;

public class ReverseVowel {


    public static void main(String[] args) {

        ReverseVowel _reverse = new ReverseVowel();
         String s = "codeleet";
        int [] indices = new int[]{4,5,6,7,0,2,1,3};
        for (String string : _reverse.restoreString(s, indices)) {
            System.out.print(string);
        }


    }
  /*
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.



   */


    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for(int i = 0; i < nums.length;i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    goodPairs++;
                }
            }
        }

        return goodPairs;
    }
    /*
    Given an array nums.
    We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
     */
    public int[] runningSum(int[] nums) {
        int [] results = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            results[i] = sum;
        }
         return results;
    }

  /*
  Given a string s and an integer array indices of the same length.
  The string s will be shuffled such that the character at the ith position
  moves to indices[i] in the shuffled string.
  Return the shuffled string.
  Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
   */
    public String[] restoreString(String s, int[] indices) {
        String [] results = new String[indices.length];
        for (int i = 0; i < indices.length; i++) {
            results[indices[i]] = String.valueOf(s.charAt(i));


        }

        return results;
    }
}
