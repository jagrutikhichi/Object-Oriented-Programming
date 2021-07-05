package com.bridgelabz.inventorymnagement;

public interface InventtoryManagementService {
	
	public void addInventoryItem(Items item);
	public void getInventoryDetails();
	public void getInventoryDataByName(String itemName);
	public void calculateInventoryItemValue();
	
}
