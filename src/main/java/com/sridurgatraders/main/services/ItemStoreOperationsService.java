package com.sridurgatraders.main.services;

import java.util.List;

import com.sridurgatraders.main.dto.Item;

public interface ItemStoreOperationsService {
	
	public String addAnItemToTheStore(Item item);
	public String upDateAnItemInTheStore(Item item);
	public String deleteAnItemFromTheStore(String itemCode);
	public List<Item> getAllItemList();
	public List<Item> getInStockItemList();
	public List<Item> getOutOfStockItemList();
	public Item getAnItem(String itemCode);
	public void parmanentlyDeleteThisItem(String itemCode);

	

	 
	
	
	
	
	

}
