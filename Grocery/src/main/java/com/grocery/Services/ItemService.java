package com.grocery.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.Repository.itemRepo;
import com.grocery.models.items;

@Service
public class ItemService {
	@Autowired
	private itemRepo itrep;


	public items newItem(items item) {
		// TODO Auto-generated method stub
		return itrep.save(item);
	}


	public List<items> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
