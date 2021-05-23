package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.EmployeeService;
import kodlama.io.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getall")
    public List<Employee> getAll(){
        return this.employeeService.getAll();
    }
    @GetMapping("/save")
    public void add(@RequestBody Employee employee){
        this.employeeService.add(employee);
    }
}
