package kodlama.io.hrms.entities.concretes;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "jobs_seekers")
@NoArgsConstructor
public class JobSeeker extends Person {

}