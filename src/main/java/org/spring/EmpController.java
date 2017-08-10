package org.spring;

import com.project.Employee;
import com.project.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmpController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.POST)
public Employee create(@RequestBody Employee employee){
Employee result = employeeRepository.save(employee);
return result;
}
    @RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
public Employee get(@PathVariable String employeeId){
return employeeRepository.findOne(employeeId);
}

}
