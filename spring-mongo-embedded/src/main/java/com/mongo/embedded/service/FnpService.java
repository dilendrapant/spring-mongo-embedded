package com.mongo.embedded.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.embedded.model.User;
import com.mongo.embedded.repository.FnpRepo;
@Transactional
@Service
public class FnpService implements FnpRepo{
	
	@Autowired
	private FnpRepo fre; 

	@Override
	public <S extends User> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return fre.saveAll(entities);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return fre.findAll();
	}

	@Override
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return fre.findAll(sort);
	}

	@Override
	public <S extends User> S insert(S entity) {
		// TODO Auto-generated method stub
		return fre.insert(entity);
	}

	@Override
	public <S extends User> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return fre.insert(entities);
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return fre.findAll(example);
	}

	@Override
	public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return fre.findAll(example, sort);
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return fre.findAll(pageable);
	}

	@Override
	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return fre.save(entity);
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return fre.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return fre.existsById(id);
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return fre.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return fre.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends User> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return fre.findOne(example);
	}

	@Override
	public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return fre.findAll(example, pageable);
	}

	@Override
	public <S extends User> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return fre.count(example);
	}

	@Override
	public <S extends User> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return fre.exists(example);
	}

	@Override
	public List<User> findByName(String name) {
		return fre.findByName(name);
	}

	public List<User> findByCity(String city) {
		// TODO Auto-generated method stub
		return fre.findByCity(city);
	}

}
