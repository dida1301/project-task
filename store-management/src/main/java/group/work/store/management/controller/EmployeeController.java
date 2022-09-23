package group.work.store.management.controller;

import group.work.store.management.models.Employee;
import group.work.store.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/Employee")
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
}
