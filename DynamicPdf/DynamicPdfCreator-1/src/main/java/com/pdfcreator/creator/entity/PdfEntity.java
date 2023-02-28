package com.pdfcreator.creator.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor; 

@NoArgsConstructor @AllArgsConstructor
public class PdfEntity {
	private String seller, sellerGstin, sellerAddress;
	private String buyer, buyerGstin, buyerAddress;
	public List<Item> items;
	
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getSellerGstin() {
		return sellerGstin;
	}
	public void setSellerGstin(String sellerGstin) {
		this.sellerGstin = sellerGstin;
	}
	public String getSellerAddress() {
		return sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getBuyerGstin() {
		return buyerGstin;
	}
	public void setBuyerGstin(String buyerGstin) {
		this.buyerGstin = buyerGstin;
	}
	public String getBuyerAddress() {
		return buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
