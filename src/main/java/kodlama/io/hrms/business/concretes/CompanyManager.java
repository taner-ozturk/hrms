package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.CompanyService;
import kodlama.io.hrms.dataAccess.CompanyDao;
import kodlama.io.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {
    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> getAll() {
        return this.companyDao.findAll();
    }

    @Override
    public void add(Company company) {
        this.companyDao.save(company);

    }

    @Override
    public Company getPhoneNumberByCompanyId(int id) {
        return this.companyDao.findById(id).orElse(null);
        //select * from componies where(companies.id=id)
    }
}
