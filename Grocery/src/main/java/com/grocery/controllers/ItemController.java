package com.grocery.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.Services.ItemService;
import com.grocery.models.items;



@RestController
@RequestMapping("item")

public class ItemController {
	
@Autowired
private ItemService itemservice;

@GetMapping
public List<items> findAll(){
	return itemservice.findAll();
	
}



@PostMapping 
public items newItem(@RequestBody items Item) {
	return itemservice.newItem(Item);
	
}









	
}


