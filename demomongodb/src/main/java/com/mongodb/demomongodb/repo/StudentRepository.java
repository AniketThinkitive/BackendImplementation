package com.mongodb.demomongodb.repo;

import com.mongodb.demomongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends MongoRepository<Student,Integer> {


}
