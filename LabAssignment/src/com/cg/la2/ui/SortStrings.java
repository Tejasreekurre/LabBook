package com.cg.la2.ui;
import java.util.Arrays;
public class SortStrings {

	public static void main(String[] args) {
		String[] ar = {"eab","acd","bcd","cde","def"};
		  for(String sIterator:sortStrings(ar))
		   System.out.println(sIterator);
			

		 }
		 static String[] sortStrings(String[] ar) {
		  Arrays.sort(ar);
		  int len = ar.length%2==0 ? ar.length/2 : ar.length/2+1;
		  for(int i=0;i<len;i++) {
		   ar[i]=ar[i].toUpperCase();
		  }
		  return ar;

	}

}
