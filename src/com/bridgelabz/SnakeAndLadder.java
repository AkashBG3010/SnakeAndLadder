package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {	
		int die = 0;
		int start = 0;
			die = (int)(Math.random()*6) + 1;
			System.out.println("Random number is: " + die );
			System.out.println("Starting position of player is: " + start);
         }
}