package ma.enset.cabinetmedical.repositories;

import ma.enset.cabinetmedical.entities.Consultation;
import ma.enset.cabinetmedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    @Query("SELECT p FROM Patient p WHERE CONCAT(p.nom, p.prenom, p.telephone, p.email, p.cin, p.dateNaissance) LIKE %?1%")
    List<Patient> search(String query);
}
