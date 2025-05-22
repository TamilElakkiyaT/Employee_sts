package com.Package.For2;

public class Forrev {
public static void main(String[] args) {
	int[] nums= {5,8,26,10};
	int c=0;
	for(int i=nums.length-1;i>=0;i--) {
		c=nums[i]+c;
	}
		System.out.println(c);
}
}
