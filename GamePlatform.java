package javatest;

import java.util.ArrayList;

public class GamePlatform {

	public static double getFinalSpeed(double initialSpeed, int[] inclinations) { 
		//throw new UnsupportedOperationException("Waiting to be implemented.");
		
		int incliCount = inclinations.length;
		
		for (int i = 0; i < incliCount; i++){
			
			int currentInclination = inclinations[i];
			
			initialSpeed -= currentInclination;
		}
		return initialSpeed;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Will print 45.0 instead of 45 as the method getFinalSpeed is of double type.
		System.out.println(getFinalSpeed(60.0, new int[] { 0, -30, 0, 45, 0 })); //should print 45
	}

}
