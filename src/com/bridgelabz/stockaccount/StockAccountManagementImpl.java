package com.bridgelabz.stockaccount;

import java.util.LinkedList;

import com.bridgelabz.inventorymnagement.Items;

public class StockAccountManagementImpl implements StockAccountManagement{

	LinkedList<Stocks> sharesList = new LinkedList<Stocks>();

	@Override
	public void addStocks(Stocks share) {
		if (sharesList.contains(share)) {
			System.err.println("Inventory Item Exists");
		}
		else {
		sharesList.add(share);
		}
		
	}

	@Override
	public void getStockDetails() {
		for (Stocks stocks : sharesList) {
			System.out.println(stocks);
		}		
	}

	@Override
	public void calculateShareValue() {
		double totalvalue = 0;
		for (Stocks stocks : sharesList) {
			double value = stocks.getShareCount() *stocks.getSharePrice();
			System.out.println("Value of "+stocks.getShareName()+" is "+value);
			totalvalue = totalvalue + value;
		}
		System.out.println("Total value is: "+totalvalue);
	}
}
