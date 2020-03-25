//package com.freeways.medical.controller;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import javax.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.freeways.medical.dao.PatientRepository;
//import com.freeways.medical.model.Patient;
//
//@RestController
//@RequestMapping(value="/rest/api")
//@CrossOrigin(origins = "http://localhost:4200")
//public class PatientController {
//	
//	 @Autowired
//	    PatientRepository patientRepository ;
//
//	    @GetMapping(value="/allPatient")
//	    public List<Patient> allPatient(){
//	        return patientRepository.findAll();
//	    }
//	    
//	    @PostMapping(value="/addPatient")
//	    //@PreAuthorize("hasRole('doctor')")
//	    public Patient addPatient(@Valid @RequestBody Patient p){
//	        return patientRepository.save(p);
//	    }
//	    
//	    
//	    @GetMapping(value="/patient/{id}")
//	    public ResponseEntity<Patient> getPatient(@PathVariable Integer id) throws Exception{
//	        Patient p = patientRepository.findById(id).orElseThrow(()->new Exception("Le patient n'existe pas"));
//	        return ResponseEntity.ok().body(p);
//	    }
//	    
//	    
//	    @PutMapping(value="/patient/{id}")
//	    //@PreAuthorize("hasRole('doctor')")
//	    public ResponseEntity<Patient> updatePatient(@PathVariable Integer id,@Valid @RequestBody Patient catDetails) throws Exception{
//	        Patient p = patientRepository.findById(id).orElseThrow(()->new Exception("Le patient n'existe pas"));
//	        p.setNom(catDetails.getNom());
//	        Patient updatePat = patientRepository.save(p);
//	        return ResponseEntity.ok(updatePat);
//	    }
//	    
//	    
//	    @DeleteMapping(value="/patient/{id}")
//	    //@PreAuthorize("hasRole('doctor')")
//	    public Map<String,Boolean> deletePatient(@PathVariable Integer id) throws Exception {
//	        Patient pat = patientRepository.findById(id).orElseThrow(()->new Exception("Le patient n'existe pas"));
//	        patientRepository.delete(pat);
//	        Map<String,Boolean> response = new HashMap<>();
//	        response.put("Patient est supprimé!",Boolean.TRUE);
//	        return response;
//	    }
//	}