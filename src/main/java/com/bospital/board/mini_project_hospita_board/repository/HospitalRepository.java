package com.bospital.board.mini_project_hospita_board.repository;


import com.bospital.board.mini_project_hospita_board.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}
