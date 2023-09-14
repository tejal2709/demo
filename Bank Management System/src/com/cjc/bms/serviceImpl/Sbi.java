package com.cjc.bms.serviceImpl;

import java.util.Scanner;

import com.cjc.bms.model.Account;
import com.cjc.bms.service.Rbi;

public class Sbi implements Rbi
{
	Account a= new Account();
Scanner sc=new Scanner(System.in);
   @Override
	public void createAccount()
	{
	System.out.println("Create Account");	
	System.out.println("Enter the Account Holder Name");
	a.setName(sc.next());
	System.out.println("Enter the Account Number");
	a.setAccno(sc.nextInt());
	System.out.println("Enter the Mobile Number");
	a.setMobNo(sc.next());
	System.out.println("Enter the Aadhar Number");
	a.setAdharNo(sc.next());
	System.out.println("Enter Gender");
	a.setGender(sc.next());
	System.out.println("Enter the Age");
	a.setAge(sc.nextInt());
	System.out.println("Enter the Balance");
	a.setBalance(sc.nextDouble());
	}

	@Override
	public void displayAllDetails() 
	{
		System.out.println("Display All Details");
		System.out.println("Name="+a.getName());
		System.out.println("Accno="+a.getAccno());
		System.out.println("MobNo="+a.getMobNo());
		System.out.println("AadharNo="+a.getAdharNo());
		System.out.println("Gender="+a.getGender());
		System.out.println("Age="+a.getGender());
		
	}

	@Override
	public void depositeMoney() 
	{
		System.out.println("Deposite Money");
		System.out.println("Enter the Deposite Amount");
		double amt =sc.nextDouble();
		double totalamt=a.getBalance()+amt;
		a.setBalance(totalamt);
	
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("Withdrawal Money");
		System.out.println("Enter the Withdrawal Amount");
		double amt =sc.nextDouble();
		double totalamt=a.getBalance()-amt;
		a.setBalance(totalamt);
		
	}

	@Override
	public void balanceCheck() 
	{
		System.out.println("Checking The Balance");
		System.out.println("Balance="+a.getBalance());
		
		
	}
}





