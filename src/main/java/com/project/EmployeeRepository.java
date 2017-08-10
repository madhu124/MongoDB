package com.project;
import java.util.List;

import com.project.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends
        MongoRepository<Employee, String> {
    public Employee findByEid(String eid);
    public List<Employee> findByEname(String ename);
}

