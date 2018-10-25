package com.hzitxx.hitao.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品二级目录
 * 
 * @author Lenovo
 *
 */
public class ShopF1 {
	private String catName;
	private int catId;
	private List<ShopFrontCategory> childrens = new ArrayList<>();

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public List<ShopFrontCategory> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<ShopFrontCategory> childrens) {
		this.childrens = childrens;
	}

	@Override
	public String toString() {
		return "ShopF1 [catName=" + catName + ", catId=" + catId + ", childrens=" + childrens + "]";
	}
   
}
