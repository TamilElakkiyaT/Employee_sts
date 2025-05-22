package com.Package.For2;

public class Forr2 {
	public static void main(String[] args) {
		int[] nums= {5,8,19,26,10};
	int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=max) {
				max=nums[i];
			}
			System.out.println(nums[i]);
		}
		System.out.println(max);
		for(int x:nums) {
			System.out.println(x);
		}

		
	}

}
