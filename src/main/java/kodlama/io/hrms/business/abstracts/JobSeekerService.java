package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();
    ResponseEntity<?> add(JobSeeker jobSeeker);
    ResponseEntity<?> update(JobSeeker jobSeeker);
}
