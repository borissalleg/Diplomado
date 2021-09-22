package com.iud.sping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iud.sping.model.userModel;
import com.iud.sping.repository.userRepository;

@Service
public class userService {
	
	@Autowired
	public userRepository Usuario;
	
	public List<userModel> listar(){
		return (List<userModel>) Usuario.findAll();
	}
	
	public void guardar(userModel usuario) {
		Usuario.save(usuario);
	}

}
