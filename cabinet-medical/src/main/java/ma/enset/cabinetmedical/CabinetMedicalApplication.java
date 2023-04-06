package ma.enset.cabinetmedical;

import ma.enset.cabinetmedical.entities.Consultation;
import ma.enset.cabinetmedical.entities.Medecin;
import ma.enset.cabinetmedical.entities.Patient;
import ma.enset.cabinetmedical.repositories.PatientRepository;
import ma.enset.cabinetmedical.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CabinetMedicalApplication implements CommandLineRunner {
	@Autowired
	private ICabinetService cabinetService;

	public static void main(String[] args) {
		SpringApplication.run(CabinetMedicalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Patient p1=new Patient(null,"Rochdi","Nezha","BE846512","0758489621","rochdi@gmail.com",new Date(),null);

		patientRepository.save(p1);
		List<Patient> patients = patientRepository.findAll();
		for (Patient p:
			 patients) {
			System.out.println(p.getNom()+" "+p.getPrenom()+" "+p.getEmail());
		}
		Patient p=patientRepository.findById(2l).get();
		p.setPrenom("Nawal");
		patientRepository.save(p);
		patientRepository.deleteById(2l);      */

//		Patient p1 =new Patient();
//		p1.setPrenom("Kamal");
//		p1.setNom("Bennani");
//		p1.setTelephone("0661121541");
//		p1.setEmail("k.bennani@gmail.com");
//		cabinetService.addPatient(p1);

		//Patient p1 =new Patient(null,"Benani","Kamal","BE655545","0661455658","k.benani@gmail.com",new Date(),null);

	/*	Medecin m1 =new Medecin(null,"Benghalem","Abdelhamid","a.benghalem@gmail.com","0522455778",null);
		cabinetService.addMedecin(m1);   */


		/*  Medecin m1 = cabinetService.getMedecinById(5l);
		Patient p1 = cabinetService.getPatientById(4l);
		Consultation c1=new Consultation(null,new Date(),"description de consultation",m1,p1);
		cabinetService.addConsultation(c1);  */

//		Consultation c2 = cabinetService.getConsultationById(6l);
//		System.out.println(c2.getDescription()+" "+c2.getMedecin().getNom()+" "+c2.getPatient().getNom());
//
//		Medecin m1 = cabinetService.getMedecinById(5l);
//		List<Consultation> consultationsByMedecin = cabinetService.getConsultationsByMedecin(m1);

		List<Patient> ListeTest = cabinetService.searchPatientByQuery("moussa");
		for (Patient p:
			 ListeTest) {
			System.out.println("NOM: "+p.getNom()+" PRENOM: "+p.getPrenom()+" CIN: "+p.getCin());
		}


	}
}
