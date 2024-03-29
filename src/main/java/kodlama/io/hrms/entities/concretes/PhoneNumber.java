package kodlama.io.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phone_numbers")
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    private Company company;
}
