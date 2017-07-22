package com.suhas.searching;

public class AllCombinationsofString {

	public static void main(String args[]) {
		char[] ch = { 'a', 'b' };
		int k = 3;
		printPermutations(ch, k);
		char[] ch2 = { 'a', 'b','c','d' };
		int k2 = 1;
		printPermutations(ch2, k2);
	}

	public static void printPermutations(char[] ch, int k) {
		int len=ch.length;
		
		printPermutaionsofLengthK( ch, "", len, k);
	}
	
	private static void printPermutaionsofLengthK(char[] ch, String prefix, int len, int k) {
		if(k==0){
			System.out.println(prefix);
			return;
			
		}
		for(int i=0;i<len;++i){
			String newPrefix=prefix+ch[i];
			printPermutaionsofLengthK( ch, newPrefix, len, k-1);
		}
		
	}

}
