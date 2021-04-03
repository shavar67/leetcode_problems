package problems;

import java.util.Arrays;

public class RichestPerson {

    public static void main(String[] args) {
        int [][] wealth = {{1,2}, {2,4}, {5,5,6,7}};
        System.out.println(maximumWealth(wealth));
    }

    /*

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i customer bank.
 Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth



     */
     public static  int maximumWealth(int[][] accounts) {
         int [] nums =new int  [accounts.length];
         for(int i =0; i < accounts.length; i++){
             for(int j = 0; j < accounts[i].length; j++){
               nums[i] += accounts[i][j];
             }
         }
        return   Arrays.stream(nums).max().getAsInt();
    }
}
