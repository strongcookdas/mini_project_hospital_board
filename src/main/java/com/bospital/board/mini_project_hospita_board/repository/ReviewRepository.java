package com.bospital.board.mini_project_hospita_board.repository;

import com.bospital.board.mini_project_hospita_board.domain.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Integer> {
    public List<Review> findAllByHospitalId(Integer id);
}
