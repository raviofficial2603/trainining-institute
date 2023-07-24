package com.awitez.candidate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.awitez.candidate.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
//	@Query("SELECT c FROM Candidate c where c.candidateId=?1")
	Candidate findByEmail(String email);
}
 