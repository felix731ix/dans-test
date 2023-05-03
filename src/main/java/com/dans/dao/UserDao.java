package com.dans.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dans.model.DAOUser;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
	DAOUser findByUsername(String username);
}