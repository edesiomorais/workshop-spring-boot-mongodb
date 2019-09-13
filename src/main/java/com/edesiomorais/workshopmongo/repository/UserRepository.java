package com.edesiomorais.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.edesiomorais.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
