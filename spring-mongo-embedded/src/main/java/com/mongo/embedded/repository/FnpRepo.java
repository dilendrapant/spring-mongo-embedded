package com.mongo.embedded.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.embedded.model.User;
@Transactional
@Repository
public interface FnpRepo extends MongoRepository<User, Long>{

	public List<User> findByName(String name);

	@Query("{'Address.city':?0}")
	public List<User> findByCity(String city);

}
