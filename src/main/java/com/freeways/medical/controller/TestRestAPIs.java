package com.freeways.medical.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TestRestAPIs {
  
  @GetMapping("/api/test/patient")
  @PreAuthorize("hasRole('PATIENT') or hasRole('DOCTOR')")
  public String patientAccess() {
    return ">>> Patient Contents!";
  }
  
  @GetMapping("/api/test/doctor")
  @PreAuthorize("hasRole('DOCTOR')")
  public String doctorAccess() {
    return ">>> Doctor Contents";
  }
}