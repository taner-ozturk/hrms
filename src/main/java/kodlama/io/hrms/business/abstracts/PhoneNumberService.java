package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.PhoneNumber;

import java.util.List;

public interface PhoneNumberService {
    List<PhoneNumber> getPhoneNumbersById(int id);
}