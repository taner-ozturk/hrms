package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.EmployeeService;
import kodlama.io.hrms.dataAccess.EmployeeDao;
import kodlama.io.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll(){
        return this.employeeDao.findAll();
    }

    @Override
    public void add(Employee employee) {
        this.employeeDao.save(employee);

    }

}
