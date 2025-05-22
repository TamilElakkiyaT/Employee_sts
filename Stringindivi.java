package com.Package.For2;

public class Stringindivi {
	public static void main(String[] args) {
		int count=0;
		String[] s=new String[5];
		s[0]="tamil";
		s[1]="elakkiya";
		s[2]="aam";
		s[3]="run";
		s[4]="ts";
		for(int i=0;i<s.length;i++) {
	       if(s[i].startsWith("a")) {
	    	   System.out.println(s[i]);
	       }
	       

}
for(int i=0;i<s.length;i++) {
	if(s[i].contains("a")||s[i].contains("e")||s[i].contains("i")||s[i].contains("o")||s[i].contains("u")) {
		System.out.println(s[i]);
	}
}
for(int i=0;i<s.length;i++) {
	if(s[i].length()==5) {
		count++;
	}}
	System.out.println(count);
	for(int i=0;i<s.length;i++) {
		
	System.out.print(s[i].charAt(s[i].length()-1));
		}}
	}