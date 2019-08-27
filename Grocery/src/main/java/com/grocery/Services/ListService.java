package com.grocery.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.Repository.listRepo;
import com.grocery.models.list;
@Service
public class ListService {

	@Autowired
	private listRepo lr;
	
	public List<list> findAll() {
		
		
		return lr.findAll();
	}

	
	public  list newList(list list) {
		
		return lr.save(list);
	}
	

}
