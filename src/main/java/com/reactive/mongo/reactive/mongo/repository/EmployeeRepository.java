package com.reactive.mongo.reactive.mongo.repository;

import com.reactive.mongo.reactive.mongo.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
