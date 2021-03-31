package com.homework.task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app {

	static void menu() {
		System.out.println("1 ");
		System.out.println("2 ");
		
	}
	

	public static void main(String[] args) {
		
		int arrSize = getRandomValue(2,4);
		
		ArrayList<Auto>arrayAuto = new ArrayList<Auto>(arrSize);
		ArrayList<ArrayList<Auto>>arrayAutoSecond = new ArrayList<>(arrSize);
		
		for(int i = 0; i< arrSize; i ++) {
			arrayAutoSecond.add(i,arrayAuto);
			for(int w = 0; w< arrSize; w ++) {
				arrayAuto.add(w,new Auto(getRandomPower(200, 360),
				getRandomCreatedAge(1890, 2016),
				getRandomMaterial(1,2),
				getRandomWheelDiametr(20, 38),
				getRandomNumderOfCylinders(2,6)));
			}
		}
		
		
		
		 Scanner scane = new Scanner (System.in);
		 
		 
		 System.out.println(arrayAuto.toString());
		 System.out.println(arrayAutoSecond.toString());
		
		
		while (true) {
			menu();
		switch (scane.next()) {
		
		case "1":{

			 System.out.println(arrayAuto.toString());
			 System.out.println(arrayAutoSecond.toString());
			break;
		}
		case"2":{
			arrayAuto.set(0, new Auto(getRandomPower(200, 360),
				getRandomCreatedAge(1890, 2016),
				getRandomMaterial(1,2),
				getRandomWheelDiametr(20, 38),
				getRandomNumderOfCylinders(2,6)));			
			System.out.println(arrayAuto);
			break;
		}
		
		}
		}
		
	}
	
	
	public static int getRandomValue(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	
	public static int getRandomPower(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomCreatedAge(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomWheelDiametr(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomNumderOfCylinders(int min, int max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	public static int getRandomMaterial(int min, int  max) {
		if(min >= max){
			throw new IllegalArgumentException("wrong");
		}
		Random r = new Random();
		return r.nextInt(max - min +1) + min;
	}
	

}
