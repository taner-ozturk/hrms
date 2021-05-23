package kodlama.io.hrms.adapter.concretes;

import kodlama.io.hrms.adapter.abstracts.ValidatePersonService;
import kodlama.io.hrms.entities.concretes.Person;
import org.springframework.stereotype.Service;

@Service
public class ValidatePersonManagerAdapter implements ValidatePersonService {
    @Override
    public boolean validate(Person person) {
        return true;
    }
}
