package com.gpteam.applist.module.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gpteam.applist.module.entity.User;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {

}
