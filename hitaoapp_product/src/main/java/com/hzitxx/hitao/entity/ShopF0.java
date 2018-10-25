package com.hzitxx.hitao.entity;

import java.util.List;

public class ShopF0 {
	private List<ShopF1> categoryContent;
	private List<ShopFrontCategory> category;

	public List<ShopF1> getCategoryContent() {
		return categoryContent;
	}

	public void setCategoryContent(List<ShopF1> categoryContent) {
		this.categoryContent = categoryContent;
	}

	public List<ShopFrontCategory> getCategory() {
		return category;
	}

	public void setCategory(List<ShopFrontCategory> category) {
		this.category = category;
	}

}
