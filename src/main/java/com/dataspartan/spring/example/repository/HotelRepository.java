package com.dataspartan.spring.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataspartan.spring.example.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	List<Hotel> findByStars(int stars);
	List<Hotel> findByNameContaining(String name);
}
