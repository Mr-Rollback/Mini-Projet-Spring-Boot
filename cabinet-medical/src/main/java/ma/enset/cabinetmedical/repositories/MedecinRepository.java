package ma.enset.cabinetmedical.repositories;

import ma.enset.cabinetmedical.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
