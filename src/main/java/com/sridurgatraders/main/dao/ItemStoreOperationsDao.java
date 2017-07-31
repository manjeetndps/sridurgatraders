package com.sridurgatraders.main.dao;

import java.util.List;

import com.sridurgatraders.main.dto.Item;

public interface ItemStoreOperationsDao {
	
	public void addAnItem(Item item);
	public String upDateAnItem(Item item);
	public String deleteAnItem(Item item);
	public List<Item> getAllItemList();
	public List<Item> getInStockItemList();
	public List<Item> getOutOfStockItemList();
	public Item getAnItem(String itemCode);
	public String deleteAnItemPermanently(Item item);

}
