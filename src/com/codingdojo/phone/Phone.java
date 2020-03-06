package com.codingdojo.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	//abstract method. this method will be implemented by the subclasses
	public abstract void displayInfo();
	
	public String getVersionNumber() {
		return this.versionNumber;
	}
	public int getBatteryPercentage() {
		return this.batteryPercentage;
	}
	public String getCarrier() {
		return this.carrier;
	}
	public String getRingTone() {
		return this.ringTone;
	}
	public String setVersionNumber(String version) {
		this.versionNumber = version;
		return this.versionNumber;
	}
	public int setBatteryPercentage(int percent) {
		this.batteryPercentage = percent;
		return this.batteryPercentage;
	}
	public String setCarrier(String carrier) {
		this.carrier = carrier;
		return this.carrier;
	}
	public String setRingTone(String ringTone) {
		this.ringTone = ringTone;
		return this.ringTone;
	}
}
