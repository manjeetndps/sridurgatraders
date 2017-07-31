package com.sridurgatraders.main.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sridurgatraders.main.daoimpl.ItemStoreOperationsDaoimpl;
import com.sridurgatraders.main.dto.Item;
import com.sridurgatraders.main.services.ItemStoreOperationsService;

@Configuration
@Import({ ItemStoreOperationsDaoimpl.class })
public class ItemStoreOperationsServiceImpl implements ItemStoreOperationsService {

	@Autowired
	public ItemStoreOperationsDaoimpl itemStoreDb;

	@Override
	public String addAnItemToTheStore(Item item) {
		if (item.getItemQuantity() > 0) {
			item.setActive(1);
		} else {
			item.setActive(0);
		}
		itemStoreDb.addAnItem(item);

		return null;
	}

	@Override
	public String upDateAnItemInTheStore(Item updateItem) {
		Item item = itemStoreDb.getAnItem(updateItem.getItemCode());
		item.setItemName(updateItem.getItemName());
		item.setItemCategory(updateItem.getItemCategory());
		item.setItemBrand(updateItem.getItemBrand());
		item.setItemPrice(updateItem.getItemPrice());
		item.setItemQuantity(updateItem.getItemQuantity());
		item.setItemWarranty(updateItem.getItemWarranty());

		if (item.getItemQuantity() <= 0) {
			item.setActive(0);
		}

		itemStoreDb.upDateAnItem(item);
		return null;
	}

	@Override
	public String deleteAnItemFromTheStore(String itemCode) {
		Item item = itemStoreDb.getAnItem(itemCode);
		item.setActive(0);
		itemStoreDb.deleteAnItem(item);
		return null;
	}

	@Override
	public void parmanentlyDeleteThisItem(String itemCode) {
		Item item = itemStoreDb.getAnItem(itemCode);
		itemStoreDb.deleteAnItemPermanently(item);

	}

	@Override
	public List<Item> getAllItemList() {
		return itemStoreDb.getAllItemList();
	}

	@Override
	public List<Item> getInStockItemList() {
		return itemStoreDb.getInStockItemList();
	}

	@Override
	public List<Item> getOutOfStockItemList() {
		return itemStoreDb.getOutOfStockItemList();
	}

	@Override
	public Item getAnItem(String itemCode) {
		return itemStoreDb.getAnItem(itemCode);
	}

}
