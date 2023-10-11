/* Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same 
element twice.

You can return the answer in any order. 

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.Scanner;

public class Sentence1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array cach nhau khoang trang:");
        String str = input.nextLine();
        String[] arr = str.split(" ");
        System.out.print("target = ");
        int target = input.nextInt();
    }
    
    public int[] twoSum(String[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                double sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]);
                if (sum == target);
                    return new int[] {i, j};
                    
            }
        }
        return new int[]{};
    }
}