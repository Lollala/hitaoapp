package com.hzitxx.hitao.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * 购物商品封装类
 * @author Lenovo
 *
 */
public class ShopTree {
	private int value;
	private String label;
	private List<ShopTree> children = new ArrayList<>();
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<ShopTree> getChildren() {
		return children;
	}
	public void setChildren(List<ShopTree> children) {
		this.children = children;
	}
	

}
