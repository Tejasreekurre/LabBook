package com.cg.la4.exercise;

class SavingsAccount extends Account{
	
	final double minimumBalance=500;
	
	public boolean withdraw(double withdraw) {
		if(super.balance-withdraw>minimumBalance) {
			balance-=withdraw;
			return true;
		}
		else
			System.out.println("You cannot withdraw Rs."+withdraw+" from your account");
		return false;
	}
	
}