package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Job;

import java.util.List;

public interface JobService {
    List<Job> getAll();

    void add(Job job);

    List<Job> getByName(String name);
}
