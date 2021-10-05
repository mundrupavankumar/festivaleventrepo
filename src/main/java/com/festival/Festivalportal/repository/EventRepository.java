package com.festival.Festivalportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festival.Festivalportal.entity.EventData;

public interface EventRepository extends JpaRepository<EventData, Long> {

}
