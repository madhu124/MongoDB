package com.project;

import com.project.Employee;
import com.project.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Component
    public class Client implements CommandLineRunner {

        @Autowired
        private EmployeeRepository repository;


        @Override
        public void run(String... args) throws Exception {

            repository.deleteAll();

            // save a couple of customers
            repository.save(new Employee("11", "John"));
            repository.save(new Employee("12", "Rani"));

            // fetch all customers
            System.out.println("Employee found with findAll():");
            System.out.println("-------------------------------");
            for (Employee employee : repository.findAll()) {

                System.out.println(employee);
            }
            System.out.println();

            // fetch an individual customer
            System.out.println("--------------------------------");
            System.out.println(repository. findByEid("12"));

            System.out.println("--------------------------------");
            for (Employee employee : repository.findByEname("John")) {
                System.out.println(employee);
            }



        }

    @Controller
    public static class controller {

    @Autowired
        private EmployeeRepository repository;

    @RequestMapping("/emp")
    public String getEmp(){
        Employee e= new Employee();
       e=         repository. findByEid("12");

        return "index.jsp";
    }
    }
}

