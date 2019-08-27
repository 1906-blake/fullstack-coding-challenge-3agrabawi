package com.grocery.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.Services.ListService;
import com.grocery.models.list;


@RestController
@RequestMapping("list")

public class ListController {
	
@Autowired
private ListService ls;

@GetMapping
public List<list> findAll(){
	return ls.findAll();
	
}



@PostMapping 
public list newList(@RequestBody list List) {
	return ls.newList(List);
	
}

@DeleteMapping()










	
}

