package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.dataAccess.JobDao;
import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public List<Job> getAll() {
        return this.jobDao.findAll();
    }

    @Override
    public void add(Job job) {
        this.jobDao.save(job);

    }

    @Override
    public List<Job> getByName(String name) {
        return this.jobDao.findJobsByNameContaining(name);
    }
}
