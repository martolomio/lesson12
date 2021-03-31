package com.homework.task1;

public class Motor {
	
	private int numberOfCylinders ;

	public Motor(int numberOfCylinders) {
		super();
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	@Override
	public String toString() {
		return "Motor [numberOfCylinders=" + numberOfCylinders + "]";
	}

	

	
	
	
	

}
