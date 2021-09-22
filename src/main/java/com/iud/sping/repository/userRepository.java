package com.iud.sping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iud.sping.model.userModel;

public interface userRepository extends JpaRepository <userModel, Integer> {

}
