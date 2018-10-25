package com.hzitxx.hitao.entity;

import java.util.List;

/**
 * 商品属性
 * 
 * @author Lenovo
 *
 */
public class Goods1 {
	private String group;
    private List<Goods2> attrs;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public List<Goods2> getAttrs() {
		return attrs;
	}
	public void setAttrs(List<Goods2> attrs) {
		this.attrs = attrs;
	}
    
}
