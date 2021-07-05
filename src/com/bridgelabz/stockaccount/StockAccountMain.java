package com.bridgelabz.stockaccount;

import java.util.Scanner;



public class StockAccountMain {

	public static void main(String[] args) {
		StockAccountManagement stockservice = new StockAccountManagementImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to Stock management");
		System.out.println("Enter the num of shares to add: ");
		int numOfShares = scanner.nextInt();
		
		for (int index = 0; index < numOfShares; index++) {
			
			Stocks newItem = new Stocks();
			
			System.out.println("Enter Share name: ");
			newItem.setShareName(scanner.next());
			System.out.println("Enter share Price: ");
			newItem.setSharePrice(scanner.nextDouble());
			System.out.println("Enter no. of share taken: ");
			newItem.setShareCount(scanner.nextDouble());	
			stockservice.addStocks(newItem);
		}
		stockservice.getStockDetails();
		stockservice.calculateShareValue();

	}

}
