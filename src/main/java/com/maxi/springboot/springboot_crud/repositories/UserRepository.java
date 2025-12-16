package com.maxi.springboot.springboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.maxi.springboot.springboot_crud.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

    boolean existsByUsername(String username);

}
