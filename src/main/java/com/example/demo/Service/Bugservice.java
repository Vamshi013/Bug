package com.example.demo.Service;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bug;
import com.example.demo.repository.Bugrepository;

@Service
public class Bugservice {
	
	@Autowired
	private Bugrepository bugRepository;
	
	public void addBug(@Valid Bug bug) {
		bugRepository.save(bug);
	}

}