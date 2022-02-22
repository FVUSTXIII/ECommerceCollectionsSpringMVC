package com.ecommerce.app.dto;

public class ItemBought {
		private String item_name;
		private Integer qty;
		private Double price;
		
		public ItemBought(String item_name, Integer qty, Double price) {
			this.item_name = item_name;
			this.qty = qty;
			this.price = price;
		}
		
		public String getItem_name() {
			return item_name;
		}
		
		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}
		
		public Integer getQty() {
			return qty;
		}
		
		public void setQty(Integer qty) {
			this.qty = qty;
		}
		
		public Double getPrice() {
			return price;
		}
		
		public void setPrice(Double price) {
			this.price = price;
		}
		
	}