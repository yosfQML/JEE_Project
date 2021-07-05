package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class CategoryService {
    public List<Category> getCategory(){
		return List.of(
			new Category(2L,"name2")
		);
	}
}
