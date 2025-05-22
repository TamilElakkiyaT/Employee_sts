package com.Package.For2;

public class Even {
	public static void main(String[] args) {
		int[] nums= {5,8,26,10};
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]%2==0) {
			System.out.println(nums[i]);
		}
	}
	}

}
