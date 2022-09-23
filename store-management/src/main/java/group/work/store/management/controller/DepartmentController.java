package group.work.store.management.controller;
import group.work.store.management.models.Department;
import group.work.store.management.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository repository;

    @GetMapping("/Department")
    public List<Department> getDepartment(){
        return repository.findAll();

    }
}
