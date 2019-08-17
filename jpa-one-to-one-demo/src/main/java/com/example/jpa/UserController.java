package com.example.jpa;
import java.util.List;

import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.jpa.model.User;
import com.example.jpa.repository.UserRepository;



@RestController
@RequestMapping(value={"/user"})
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping(value="/get",headers="Accept=Applciation/json")
	public List<User> getAllUser(){
		List<User> tasks=userRepo.findAll();
		return tasks;
	}

	}

