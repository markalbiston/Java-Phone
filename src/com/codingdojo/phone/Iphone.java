package com.codingdojo.phone;

public class Iphone extends Phone implements Ringable {

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		// TODO Auto-generated constructor stub
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		return ("iPhone "+this.getVersionNumber()+" says "+this.getRingTone());
	}
	@Override
	public String unlock() {
		return ("Unlocking via facial recognition");
	}
	@Override
	public void displayInfo() {
		System.out.println("iPhone "+ this.getVersionNumber()+" from "+ this.getCarrier());
	}

}
