package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bug;
import com.example.demo.repository.Bugrepository;
import com.example.demo.Service.Bugservice;

@RestController
public class BugController {
	
	@Autowired
	private Bugservice bugService;
	
	@Autowired
	private Bugrepository bugRepository;
	
	@PostMapping("/bug")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addBug(@RequestBody @Valid Bug bug) {
		bugService.addBug(bug);
	}
	@GetMapping("/bug")
	public List<Bug> getAllBugs() {
		return bugRepository.findAll();
	}
	

}
