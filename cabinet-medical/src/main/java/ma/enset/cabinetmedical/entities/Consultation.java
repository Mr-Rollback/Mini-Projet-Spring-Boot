package ma.enset.cabinetmedical.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString @Data
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    private String description;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    private Patient patient;
}
