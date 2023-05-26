package com.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaramServiceImpl implements SaramService {

	@Autowired
	SaramRepository saramRepository;
	
	@Override
	public void insert(Map<String, Object> map) {
		System.out.println("Service");
		System.out.println(map.get("id"));
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println();
		saramRepository.insert(map);

	}

	@Override
	public List<Map<String, Object>> select() {
		
		return saramRepository.select();
	}

}
