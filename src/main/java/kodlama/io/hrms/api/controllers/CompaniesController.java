package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.CompanyService;
import kodlama.io.hrms.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/getall")
    public List<Company> getAll(){
        return this.companyService.getAll();
    }

    @PostMapping("/save")
    void add(@RequestBody Company company){
        this.companyService.add(company);
    }

    @GetMapping("/getcompanybyid/{id}")
    Company getCompanyById(@PathVariable int id){
        return this.companyService.getPhoneNumberByCompanyId(id);
    }

    @GetMapping("/getcompanybyid2")
    Company getCompanyById2(int id, @RequestParam (value = "isim") String name){
        System.out.println(name);
        return this.companyService.getPhoneNumberByCompanyId(id);
    }
}
