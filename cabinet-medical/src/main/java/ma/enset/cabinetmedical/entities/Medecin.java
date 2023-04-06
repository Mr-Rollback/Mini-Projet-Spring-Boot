package ma.enset.cabinetmedical.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @Data @ToString
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    @OneToMany(mappedBy = "medecin")
    private Collection<Consultation> consultations;
}
