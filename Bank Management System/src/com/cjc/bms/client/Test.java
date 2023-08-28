package com.cjc.bms.client;

import java.util.Scanner;

import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;

public class Test 
{
public static void main(String[] args) 
{
	Rbi bank=new Sbi();
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Create Account\n"
	+"2.Display All Details\n"
    +"3.Deposite Money\n"
	+"4.Withdrawal Money\n"
	+ "5.Balance Check\n");
	while(true)
	{
		System.out.println("Enter Your Choice");
	int ch=sc.nextInt();
	if(ch==1)
	{
		bank.createAccount();
	}
	else if(ch==2)
	{
		bank.displayAllDetails();
	}
	else if(ch==3)
	{
		bank.depositeMoney();
	}
	else if(ch==4)
	{
		bank.withdrawal();
	
	}
	else if (ch==5) 
	{
		bank.balanceCheck();
	}
}
}
}
