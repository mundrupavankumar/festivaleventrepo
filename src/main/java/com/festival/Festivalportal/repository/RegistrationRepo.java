package com.festival.Festivalportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festival.Festivalportal.entity.RegistrationData;

public interface RegistrationRepo extends JpaRepository<RegistrationData, Long> {

}
