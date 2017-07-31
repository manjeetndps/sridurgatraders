package com.sridurgatraders.main.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	@Column(name = "itemname")
	public String itemName;

	@Id
	@Column(name = "itemcode")
	public String itemCode;

	@Column(name = "itemcategory")
	public String itemCategory;

	@Column(name = "itemprice")
	public String itemPrice;

	@Column(name = "itembrand")
	public String itemBrand;

	@Column(name = "itemquantity")
	public int itemQuantity;

	@Column(name = "itemwarranty")
	public String itemWarranty;

	@Column(name = "moredetails")
	public String moreDetails;

	@Column(name = "active")
	public int active;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemWarranty() {
		return itemWarranty;
	}

	public void setItemWarranty(String itemWarranty) {
		this.itemWarranty = itemWarranty;
	}

	public String getMoreDetails() {
		return moreDetails;
	}

	public void setMoreDetails(String moreDetails) {
		this.moreDetails = moreDetails;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemCode=" + itemCode + ", itemCategory=" + itemCategory
				+ ", itemPrice=" + itemPrice + ", itemBrand=" + itemBrand + ", itemQuantity=" + itemQuantity
				+ ", itemWarranty=" + itemWarranty + ", moreDetails=" + moreDetails + ", active=" + active + "]";
	}

}
