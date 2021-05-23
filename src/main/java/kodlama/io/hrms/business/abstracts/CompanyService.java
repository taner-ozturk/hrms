package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();
    void add(Company company);
    Company getPhoneNumberByCompanyId(int id);
}
