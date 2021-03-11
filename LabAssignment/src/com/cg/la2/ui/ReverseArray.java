package com.cg.la2.ui;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] ar = {2437,6321};
		for(int iIterator :getSorted(ar))
			System.out.println(iIterator);
		 }
	static int[] getSorted(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			int tempSum=0;
			while(ar[i]!=0) {
				tempSum *=10;
			    tempSum +=ar[i]%10;
			    ar[i] /=10;
			    }
			ar[i]=tempSum;
			}
		Arrays.sort(ar);
		return ar;
		}
	}
