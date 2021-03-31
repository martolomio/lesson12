package com.homework.task1;

public class Helm extends Motor{
	
	private int wheelDiameter;
	private int material;
	
	
	public int getWheelDiameter() {
		return wheelDiameter;
	}
	public void setWheelDiameter(int wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	public int getMaterial() {
		return material;
	}
	public void setMaterial(int material) {
		this.material = material;
	}
	
	public Helm(int numberOfCylinders, int wheelDiameter, int material) {
		super(numberOfCylinders);
		this.wheelDiameter = wheelDiameter;
		this.material = material;
	
	}
	@Override
	public String toString() {
		return "Helm [wheelDiameter=" + wheelDiameter + ", material=" + material + ", toString()=" + super.toString()
				+ "]";
	}
	
	

	
	
	
}