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
@Table(name = "list")

public class list {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="list_id")
private int listId;

@Column(name="name")
private String listName;

private int quantity;

private String type;

public list() {
	super();
	// TODO Auto-generated constructor stub
}

public list(int listId, String listName, int quantity, String type) {
	super();
	this.listId = listId;
	this.listName = listName;
	this.quantity = quantity;
	this.type = type;
}

public int getListId() {
	return listId;
}

public void setListId(int listId) {
	this.listId = listId;
}

public String getListName() {
	return listName;
}

public void setListName(String listName) {
	this.listName = listName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + listId;
	result = prime * result + ((listName == null) ? 0 : listName.hashCode());
	result = prime * result + quantity;
	result = prime * result + ((type == null) ? 0 : type.hashCode());
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
	list other = (list) obj;
	if (listId != other.listId)
		return false;
	if (listName == null) {
		if (other.listName != null)
			return false;
	} else if (!listName.equals(other.listName))
		return false;
	if (quantity != other.quantity)
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
}

@Override
public String toString() {
	return "list [listId=" + listId + ", listName=" + listName + ", quantity=" + quantity + ", type=" + type + "]";
}








}
