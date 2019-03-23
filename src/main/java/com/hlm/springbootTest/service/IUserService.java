package com.hlm.springbootTest.service;


import com.hlm.springbootTest.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserService extends CrudRepository<User,Integer> {
}
