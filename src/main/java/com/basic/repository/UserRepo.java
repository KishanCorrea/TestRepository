package com.basic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.basic.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {

}
