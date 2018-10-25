package com.hzitxx.hitao.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 大树封装类
 * 
 * @author Lenovo
 *
 */
public class Tree {
	private int id;
	private String name;
	private int parentId;
	private List<Tree> children = new ArrayList<>();
	private int isDel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public List<Tree> getChildren() {
		return children;
	}

	public void setChildren(List<Tree> children) {
		this.children = children;
	}

	public int getIsDel() {
		return isDel;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "Tree [id=" + id + ", name=" + name + ", parentId=" + parentId + ", children=" + children + ", isDel="
				+ isDel + "]";
	}

}
