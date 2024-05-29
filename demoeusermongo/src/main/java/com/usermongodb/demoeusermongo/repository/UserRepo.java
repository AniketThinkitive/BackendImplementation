package com.usermongodb.demoeusermongo.repository;

import com.usermongodb.demoeusermongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository <User,Integer>{
}
