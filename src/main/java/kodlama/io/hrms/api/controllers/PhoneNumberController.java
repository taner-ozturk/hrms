package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.PhoneNumberService;
import kodlama.io.hrms.entities.concretes.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/phonenumbers")
public class PhoneNumberController {
    @Autowired
    private PhoneNumberService phoneNumberService;

    @GetMapping("/getphonenumbersbyuserid")
    List<PhoneNumber> getPhoneNumbersByUserId(int id){
        return this.phoneNumberService.getPhoneNumbersById(id);
    }
}
