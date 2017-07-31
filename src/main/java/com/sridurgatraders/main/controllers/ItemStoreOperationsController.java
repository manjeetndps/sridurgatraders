package com.sridurgatraders.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sridurgatraders.main.dto.Item;
import com.sridurgatraders.main.servicesimpl.ItemStoreOperationsServiceImpl;

@Configuration
@Import({ ItemStoreOperationsServiceImpl.class })
@Controller
public class ItemStoreOperationsController {
	
	@Autowired
	private ItemStoreOperationsServiceImpl itemStoreService;


	@RequestMapping(value = "/addAnItem")
	public String addAnItem() {

		return "durgaTradersAdminAddItem";
	}

	@RequestMapping(value = "/storingAnItem", method = RequestMethod.POST)
	public ModelAndView storingAnItem(@ModelAttribute("user") Item item) {
		itemStoreService.addAnItemToTheStore(item);

		ModelAndView mv = new ModelAndView("durgaTradersAdminDisplayItems");
		mv.addObject("itemlist", itemStoreService.getAllItemList());
		return mv;
	}
	
	@RequestMapping(value = "/updateAnItem/{itemCode}", method = RequestMethod.GET)
	public ModelAndView updateAnItem(@PathVariable String itemCode) {
		
		Item item=itemStoreService.getAnItem(itemCode);
		
		ModelAndView mv = new ModelAndView("durgaTradersAdminUpdateItem");
		mv.addObject("icode", item.getItemCode());
		mv.addObject("iname", item.getItemName());
		mv.addObject("iprice", item.getItemPrice());
		mv.addObject("ibrand", item.getItemBrand());
		mv.addObject("iquantity", item.getItemQuantity());
		mv.addObject("iwarranty", item.getItemWarranty());
		mv.addObject("imore", item.getMoreDetails());
		return mv;

	}
	
	@RequestMapping(value = "/updatingAnItem", method = RequestMethod.POST)
	public ModelAndView updatingAnItem(@ModelAttribute("user") Item item) {
		itemStoreService.upDateAnItemInTheStore(item);

		ModelAndView mv = new ModelAndView("durgaTradersAdminDisplayItems");
		mv.addObject("itemlist", itemStoreService.getAllItemList());
		return mv;
	}
	
	@RequestMapping(value = "/deletingAnItemPermanently/{itemCode}", method = RequestMethod.POST)
	public ModelAndView deletingAnItem(@PathVariable String itemCode) {
		itemStoreService.parmanentlyDeleteThisItem(itemCode);

		ModelAndView mv = new ModelAndView("durgaTradersAdminDisplayItems");
		mv.addObject("itemlist", itemStoreService.getAllItemList());
		return mv;
	}
	
	@RequestMapping(value = "/deleteAnItemforOutOfStock/{itemCode}", method = RequestMethod.POST)
	public ModelAndView deleteAnItemforOutOfStock(@PathVariable String itemCode) {
		itemStoreService.deleteAnItemFromTheStore(itemCode);

		ModelAndView mv = new ModelAndView("durgaTradersAdminDisplayItems");
		mv.addObject("itemlist", itemStoreService.getAllItemList());
		return mv;
	}
	
	@RequestMapping(value = "/getInStockItemsOnly", method = RequestMethod.GET)
	public ModelAndView getInStockItemsOnly(){
		ModelAndView mv = new ModelAndView("durgaTradersAdminDisplayItems");
		mv.addObject("itemlist", itemStoreService.getInStockItemList());
		return mv;
	}
	
	@RequestMapping(value = "/getOutOfStockItemsOnly", method = RequestMethod.GET)
	public ModelAndView getOutOfStockItemsOnly(){
		ModelAndView mv = new ModelAndView("durgaTradersAdminDisplayItems");
		mv.addObject("itemlist", itemStoreService.getInStockItemList());
		return mv;
	}
	
	@RequestMapping(value = "/getAllItemsList", method = RequestMethod.GET)
	public ModelAndView getAllItemsList(){
		ModelAndView mv = new ModelAndView("durgaTradersAdminDisplayItems");
		mv.addObject("itemlist", itemStoreService.getAllItemList());
		return mv;
	}
	
	

}
