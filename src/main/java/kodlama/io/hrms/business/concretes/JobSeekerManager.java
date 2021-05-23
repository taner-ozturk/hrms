package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.adapter.abstracts.ValidatePersonService;
import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.dataAccess.JobSeekerDao;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private ValidatePersonService validatePersonService;
    @Override
    public List<JobSeeker> getAll() {
        return this.jobSeekerDao.findAll();
    }

    @Override
    public ResponseEntity<?> add(JobSeeker jobSeeker) {
        if (this.validatePersonService.validate(jobSeeker)){
            return ResponseEntity.ok(this.jobSeekerDao.save(jobSeeker));
        }
        return ResponseEntity.badRequest().body("işlem başarısız");
    }

    @Override
    public ResponseEntity<?> update(JobSeeker jobSeeker) {
        JobSeeker updadetJobSeeker = this.jobSeekerDao.findJobSeekerById(jobSeeker.getId());
        if(updadetJobSeeker != null) {
            updadetJobSeeker.setPassword(jobSeeker.getPassword());
            if(jobSeeker.getEmail() != null){
                updadetJobSeeker.setEmail(jobSeeker.getEmail());
            }

            //updadetJobSeeker.setNationalIdentity(jobSeeker.getNationalIdentity());
            return ResponseEntity.ok(this.jobSeekerDao.save(updadetJobSeeker));
        }
        else{
            return ResponseEntity.badRequest().body("Kayit bulunamadi");
        }
    }
}
