package com.helloclass;

import java.util.Scanner;

public class HiChris {

	public static void main(String[] args) {

		// variables
		String Hello = "Hello World";

		int Number = 1492;

		boolean iDoNotHaveADogAtHome = true;

		String Date = "August 2nd, 2016";

		double Amount = 5.45;

		char X = 'X';

		// printing variables
		System.out.println("Hellow World");
		System.out.println("Columbus Sailed the world in " + Number);
		System.out.println("It is " + iDoNotHaveADogAtHome + " that I do not have a dog at home");
		System.out.println("Today is " + Date);
		System.out.println("I spent $" + Amount + " on a cheeseburger");
		System.out.println(X + " marks the spot");
		System.out.println();

		// music
		String[] music = new String[10];
		music[0] = "The ONEders";
		music[1] = "Captain Geech and the Shrimp Shack Shooters";
		music[2] = "The Lone Rangers";
		music[3] = "Crash and the Boys";
		music[4] = "Sex Bob-omb";
		music[4] = "Crucial Taunt";
		music[5] = "Col. Claypool's Bucket of Burning Brains";
		music[6] = "Stillwater";
		music[7] = "Spinal Tap";
		music[8] = "The Beets";
		music[9] = "Autobahn";

		// movies
		String[] comicBookMovies = { "Suicide Squad", "Civil War", "X-Men: Apocalypse", "Batman Vs. Superman",
				"Avengers", "Avengers: Age of Ultron", "Ant-Man", "Spider-Man", "The Winter Soldier" };

		for (int i = 0; i < music.length; i++) {
			System.out.println(music[i]);
		

		}
		System.out.println();
		printMulti();
	}


		public static void know(String[] args) {
		String know = "I don't know what to put";
		}
		
		private static int brothers(int HowManyBrothers)  {
			int brothers = HowManyBrothers;
			return brothers;
		}
		
		public static char Right(boolean RightHanded) {
			char Right = 'R';
			if (RightHanded) {
				 Right = 'R';
			}else {
				Right = 'L';
			}
			return Right;
		}
		public static double Decimals(double Hundreths) {
			double Decimals = Hundreths/(Hundreths ++);
			return Decimals;
		}
		public static float Percents(float Stuff) {
			float Percents = Stuff/100;
			return Percents;
		}
		
		public static void printMulti() {
			String [][] aryNumbers = new String [4][3];
			aryNumbers[0][0] = "Food ";
			aryNumbers[0][1] = "Chilli ";
			aryNumbers[0][2] = "Pizza ";
			aryNumbers[1][0] = "Albums ";
			aryNumbers[1][1] = "The Battle of LA ";
			aryNumbers[1][2] = "Sgt. Pepper's ";
			aryNumbers[2][0] = "Books ";
			aryNumbers[2][1] = "One Fish, Two Fish ";
			aryNumbers[2][2] = "Green Eggs and Ham ";
			aryNumbers[3][0] = "Movies ";
			aryNumbers[3][1] = "The Lion King ";
			aryNumbers[3][2] = "Aladdin ";
			
			int rows = 4;
			int columns = 3;
			int i,j;
			
			for (i = 0; i < rows; i++) {
				for (j = 0; j < columns; j++) {
					System.out.println(aryNumbers[i][j]);
				}
				System.out.println("");
			}
		}
}	
		