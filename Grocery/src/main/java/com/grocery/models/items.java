package com.grocery.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "items")

public class items {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="item_id")
private int itemId;

@Column(name="name")
private String description;

private int price;

private int list;

public items() {
	super();
	// TODO Auto-generated constructor stub
}

public items(int itemId, String description, int price, int list) {
	super();
	this.itemId = itemId;
	this.description = description;
	this.price = price;
	this.list = list;
}

public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getList() {
	return list;
}

public void setList(int list) {
	this.list = list;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + itemId;
	result = prime * result + list;
	result = prime * result + price;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	items other = (items) obj;
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (itemId != other.itemId)
		return false;
	if (list != other.list)
		return false;
	if (price != other.price)
		return false;
	return true;
}

@Override
public String toString() {
	return "items [itemId=" + itemId + ", description=" + description + ", price=" + price + ", list=" + list + "]";
}

}


