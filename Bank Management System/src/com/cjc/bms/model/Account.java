package com.cjc.bms.model;

public class Account
{
private int Accno;
private String name;
private String mobNo;
private String adharNo;
private String gender;
private int age;
private double balance;
public int getAccno() {
	return Accno;
}
public void setAccno(int accno) {
	Accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobNo() {
	return mobNo;
}
public void setMobNo(String mobNo) {
	this.mobNo = mobNo;
}
public String getAdharNo() {
	return adharNo;
}
public void setAdharNo(String adharNo) {
	this.adharNo = adharNo;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
