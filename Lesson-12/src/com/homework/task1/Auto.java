package com.homework.task1;

public class Auto extends Helm {
	
	private int power;
	private int createdAge;
	
	
	
	/*public Auto(int numberOfCylinders, int power, int createdAge) {
		super(numberOfCylinders);
		this.power = power;
		this.createdAge = createdAge;
	}*/
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getCreatedAge() {
		return createdAge;
	}
	public void setCreatedAge(int createdAge) {
		this.createdAge = createdAge;
	}
	
	public Auto(int createdAge, int power,int material, int wheelDiameter, int numberOfCylinders ) {
		super(numberOfCylinders, wheelDiameter, material);
		this.createdAge =createdAge;
		this.power= power;
	}
	@Override
	public String toString() {
		return "Auto [power=" + power + ", createdAge=" + createdAge + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
