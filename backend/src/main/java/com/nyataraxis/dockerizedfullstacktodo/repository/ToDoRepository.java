package com.nyataraxis.dockerizedfullstacktodo.repository;

import com.nyataraxis.dockerizedfullstacktodo.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {}