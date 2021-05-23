package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.dataAccess.UserDao;
import kodlama.io.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int id) {
        return this.userDao.findById(id).orElse(null);
    }
}
