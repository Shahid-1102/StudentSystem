package com.shahid.StudentSystem.repo;

import com.shahid.StudentSystem.model.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, ObjectId> {
}
