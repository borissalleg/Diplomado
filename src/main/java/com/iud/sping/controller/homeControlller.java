package com.iud.sping.controller;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iud.sping.model.userModel;



@RestController
@RequestMapping(value="/home")
public class homeControlller {
	
	
	@GetMapping("/")
	public String home() {
		
		return "Cargado el home";
	}



	
	
	
}
