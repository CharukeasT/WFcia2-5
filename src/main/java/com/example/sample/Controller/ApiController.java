package com.example.sample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.Repository.OwnerRepo;
import com.example.sample.Table.Owner;

@RestController
public class ApiController {
	@Autowired
	private OwnerRepo r;
	@PostMapping("/postOwner")
	public Owner addDetails(@RequestBody Owner o) {
		return r.save(o);
	}
	@GetMapping("/getOwner")
	public List<Owner> getDetails(){
		return r.findAll();
	}
	@GetMapping("getOwner/{ownerId}")
	public Optional<Owner> getDetailsById(int ownerId) {
		return r.findById(ownerId);
	}
}
