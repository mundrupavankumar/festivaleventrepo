package com.festival.Festivalportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.festival.Festivalportal.entity.UserData;

public interface UserRepo extends JpaRepository<UserData, Long> {
	
	@Query(value ="select * from user_data u where u.user_name=?1 and u.password=?2" ,nativeQuery = true )
	UserData getUser(String username,String password);

}
