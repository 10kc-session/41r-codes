package com.encapsulation;

public class Engine {
	private String cc;
	private String horsePower;
	private String mielage;
	
	public Engine(String cc , String horsePower , String mielage) {
		this.cc = cc;
		this.horsePower = horsePower;
		this.mielage = mielage;
	}	
	
	public String getCc() {
		return cc;
	}
	
	public void setCc(String cc) {
		this.cc = cc;
	}
	
	public String getHorsePower() {
		return horsePower;
	}
	
	public void setHorsePower(String horsePower) {
		this.horsePower = horsePower;
	}
	
	public String getMielage() {
		return mielage;
	}
	
	public void setMielage(String mielage) {
		this.mielage = mielage;
	}

	public String toString() {
		return "Engine [cc=" + cc + ", horsePower=" + horsePower + ", mielage=" + mielage + "]";
	}
}
