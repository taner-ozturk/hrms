package kodlama.io.hrms.dataAccess;

import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobDao extends JpaRepository<Job,Integer> {
    List<Job> findJobsByNameContaining(String name);
}
