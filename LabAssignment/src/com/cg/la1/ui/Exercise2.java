package com.cg.la1.ui;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 String light= scan.nextLine();
		 switch (light)
		 {
		 
		 case "red":
			 System.out.println("stop");
			 break;
		 case "green":
			 System.out.println("go");
			 break;
	     case "yellow":
	    	 System.out.println("wait");
	    	 break;
	    	 }
		 scan.close();
	}

}
