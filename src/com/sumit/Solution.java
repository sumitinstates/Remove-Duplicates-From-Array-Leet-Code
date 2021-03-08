package com.sumit;

public class Solution {

	public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        
        int i =0;
        
        for(int j = 1 ; j<nums.length ; j++)
        {
            if(nums[j]!=nums[i])
            {
                i = i+1;
                nums[i] = nums[j];
            }
        }
        
        //Have to add 1 to i because of indexes are 0 based.
        int length = i+1;
        return length;
    }
	
	public static void main(String[] args) {
		
		int [] arr1 = {1,1,2};
		
		int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(Solution.removeDuplicates(arr1));
		
		System.out.println(Solution.removeDuplicates(arr2));
	}
}
