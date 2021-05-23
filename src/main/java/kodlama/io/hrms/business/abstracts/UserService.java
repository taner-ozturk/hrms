package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.User;

public interface UserService {
    User getById(int id);
}
