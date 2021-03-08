package com.sumit;

public class Solution {
    
	/* Constraint is:
	 * We can only use O(1) space so we can't use any extra space.
	 * 
	 * Algorithm working:
	 * 1. take two pointers.
	 * 2. since array is already sorted according to problem. we check if current element is not equal to 
	 * next element. if it is not, then we increase the pointer i and copy the value of nums[j] to
	 * nums[i+1]. and then increase the j pointer and continue the process.
	 * 
	 * 3. to get length add 1 to last i we get after going through array as indexes are 0 based.
	 */
	
	public static int removeDuplicates(int[] nums) 
	{
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
