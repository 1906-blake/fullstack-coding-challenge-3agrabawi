package com.grocery.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.models.items;

@Repository
public interface itemRepo extends JpaRepository<items, Integer>{

	items save(items item);
}
