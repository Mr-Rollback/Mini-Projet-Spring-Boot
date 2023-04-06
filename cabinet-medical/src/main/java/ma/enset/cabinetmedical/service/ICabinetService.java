package ma.enset.cabinetmedical.service;

import ma.enset.cabinetmedical.entities.Consultation;
import ma.enset.cabinetmedical.entities.Medecin;
import ma.enset.cabinetmedical.entities.Patient;

import java.util.List;

public interface ICabinetService {
    List<Patient> getAllPatients();
    List<Patient> searchPatientByQuery(String query);
    void addPatient(Patient patient);
    void deletePatientById(Long id);
    List<Consultation> getConsultationsByPatient(Patient patient);
    void addMedecin(Medecin medecin);
    List<Medecin> getAllMedecins();
    void deleteMedecinById(Long id);
    List<Consultation> getConsultationsByMedecin(Medecin medecin);
    void addConsultation(Consultation consultation);
    List<Consultation> getAllConsultations();
    void deleteConsultation(Consultation consultation);
    Medecin getMedecinById(Long id);
    Patient getPatientById(Long id);
    Consultation getConsultationById(Long id);
}
