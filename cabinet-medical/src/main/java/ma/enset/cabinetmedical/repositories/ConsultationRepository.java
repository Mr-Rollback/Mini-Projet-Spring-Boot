package ma.enset.cabinetmedical.repositories;

import ma.enset.cabinetmedical.entities.Consultation;
import ma.enset.cabinetmedical.entities.Medecin;
import ma.enset.cabinetmedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
   List<Consultation> findConsultationByPatient(Patient patient);
   List<Consultation> findConsultationByMedecin(Medecin medecin);

}
