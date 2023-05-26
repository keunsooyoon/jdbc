package com.spring.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SaramRepositoryImpl implements SaramRepository {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	
	@Override
	public void insert(Map<String, Object> map) {
		System.out.println("Repository");
		System.out.println(map.get("id"));
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println();
		sqlSessionTemplate.insert("saram.insert",map);

	}

	@Override
	public List<Map<String, Object>> select() {
		
		return sqlSessionTemplate.selectList("saram.select");
	}

}
