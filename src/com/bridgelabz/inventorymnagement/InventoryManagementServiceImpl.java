package com.bridgelabz.inventorymnagement;

import java.util.LinkedList;

public class InventoryManagementServiceImpl implements InventtoryManagementService {

	LinkedList<Items> itemList = new LinkedList<Items>();
	
	
	@Override
	public void addInventoryItem(Items item) {
		if (itemList.contains(item)) {
			System.err.println("Inventory Item Exists");
		}
		else {
		itemList.add(item);
		}
	}


	@Override
	public void getInventoryDetails() {
		for (Items item : itemList) {
			System.out.println(item);
		}
	}


	@Override
	public void getInventoryDataByName(String itemName) {
		for (Items item : itemList) {
			if (item.getItemName().equals(itemName)) {
				System.out.println(item);
				break;
			}
		}	
	}


	@Override
	public void calculateInventoryItemValue() {
		for (Items item : itemList) {
			double itemValue = item.getItemWeight()*item.getItemPricePerKg();
			System.out.println("Value of item "+item.getItemName()+" is "+itemValue);
		}			
	}

}
