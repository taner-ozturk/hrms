package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.PhoneNumberService;
import kodlama.io.hrms.dataAccess.PhoneNumberDao;
import kodlama.io.hrms.entities.concretes.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNumberManager implements PhoneNumberService {
    @Autowired
    private PhoneNumberDao phoneNumberDao;

    @Override
    public List<PhoneNumber> getPhoneNumbersById(int id) {
        return this.phoneNumberDao.findPhoneNumbersByCompanyId(id);
    }
}
