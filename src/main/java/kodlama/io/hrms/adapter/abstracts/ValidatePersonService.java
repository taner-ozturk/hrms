package kodlama.io.hrms.adapter.abstracts;

import kodlama.io.hrms.entities.concretes.Person;

public interface ValidatePersonService {
    boolean validate(Person person);
}
