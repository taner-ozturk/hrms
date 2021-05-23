package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    void add(Employee employee);
}
