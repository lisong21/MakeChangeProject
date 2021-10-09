package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double item;
		double tendered;
		boolean keepGoing = true;
		int fiftyCounter = 0;
		int twentyCounter = 0;
		int tenCounter = 0;
		int fiveCounter = 0;
		int oneCounter = 0;
		int quarterCounter = 0;
		int dimeCounter = 0;
		int nickleCounter = 0;
		int penniesCounter = 0;

		// User Story #1
		// The user is prompted asking for the price of the item.

		System.out.println("What is the price of the item?");
		item = sc.nextDouble();
		System.out.println("cost is " + item);
		// User Story #2
		// The user is then prompted asking how much
		// money was tendered by the customer.

		System.out.println("This the amount tendered");
		tendered = sc.nextDouble();
		System.out.println("You have given me " + tendered + " for this item");
		// User Story #3
		// Display an appropriate message if the customer provided
		// too little money or the exact amount.

		if (tendered < item) {

			System.out.println("You have given too little money");

		}

		if (tendered % item == 0.0) {
			System.out.println("You have given the correct amount");

		}
		//// User Story #4
		// If the amount tendered is more than the cost of the item,
		// display the number of bills and coins that should
		// be given to the customer.s
		
		//double change = tendered - item;
		int intChange = (int)((tendered * 100) - (item * 100));
		
	

		while (intChange >= 2000) {
			intChange = intChange - 2000;
			twentyCounter++;

		}
		if (twentyCounter > 0) {
			System.out.println(twentyCounter + " $20 bills");
		}

		while (intChange >= 1000) {
			intChange = intChange - 1000;
			tenCounter++;

		}
		if (tenCounter > 0) {
			System.out.println(tenCounter + " $10 bills");
		}

		while (intChange >= 500) {
			intChange = intChange - 500;
			fiveCounter++;


		}
		if (fiveCounter > 0) {
			System.out.println(fiveCounter + " $5 bills");
		}

		while (intChange >= 100) {
			intChange = intChange - 100;
			oneCounter++;


		}
		if (oneCounter > 0) {
			System.out.println(oneCounter + " $1 bills");
		}

		while (intChange >= 25) {
			intChange = intChange - 25;
			quarterCounter++;

		}
		if (quarterCounter > 0) {
			System.out.println(quarterCounter + " Quarter");
		}

		while (intChange >= 10) {
			intChange = intChange - 10;
			dimeCounter++;



		}
		if (dimeCounter > 0) {
			System.out.println(dimeCounter + " Dime");
		}

		while (intChange >= 5) {
			nickleCounter++;
			intChange = intChange - 5;


		}
		if (nickleCounter > 0) {
			System.out.println(nickleCounter + " Nickle");
		}

		while (intChange >= 1) {
			penniesCounter++;
			intChange = intChange - 1;

		}
		if (penniesCounter > 0) {
			System.out.println(penniesCounter + " Penny");
		}

	}
}