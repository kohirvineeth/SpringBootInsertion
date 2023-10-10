package com.virtusa.SpringBootJDBC123;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootInsertion {

	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/insert")
	public String insertrecord() {
		String query="insert into product1(id,name) values('p102','vineeth')";
		jdbc.execute(query);
		return "data inserted succefully ok"; 
		
	}
}