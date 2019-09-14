package com.cap.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cap.demo.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<com.cap.demo.model.User> findAll();
}
