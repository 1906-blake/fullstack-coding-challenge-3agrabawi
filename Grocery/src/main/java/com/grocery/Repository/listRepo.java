package com.grocery.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.models.list;
@Repository
public interface listRepo extends JpaRepository<list, Integer>{

//	static List<list> findAll() {
//		
//		return null;
//	}
//
//	static list save(List list) {
//		
//		return null;
//	}


}
		
	
