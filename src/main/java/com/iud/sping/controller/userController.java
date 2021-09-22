package com.iud.sping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iud.sping.model.userModel;
import com.iud.sping.repository.userRepository;
import com.iud.sping.services.userService;

@RestController
@RequestMapping(value="/users")
public class userController {
	
   
	@Autowired
	private userService Usuarios;
	
	@GetMapping(value="/show")
	public List<userModel> ListarUsuario() {
		
		return (List<userModel>) Usuarios.listar();
		
	}
	
	@PostMapping(value="/save")
	public void guardarUsuario(@RequestBody userModel usuario) {
		 Usuarios.guardar(usuario);
		 System.out.println("Regsitro User guardado");
		
	}
	

}
