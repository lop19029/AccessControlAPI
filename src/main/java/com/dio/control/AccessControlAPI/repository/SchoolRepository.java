package com.dio.control.AccessControlAPI.repository;

import com.dio.control.AccessControlAPI.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}
