package ma.enset.cabinetmedical.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Collection;
import java.util.List;

// classe persistante
@Entity @NoArgsConstructor @AllArgsConstructor @ToString @Data
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String nom;
    @Column(length = 100)
    private String prenom;
    private String cin;
    private String telephone;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> consultations;

}
