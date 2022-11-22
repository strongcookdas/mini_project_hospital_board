package com.bospital.board.mini_project_hospita_board.service;

import com.bospital.board.mini_project_hospita_board.domain.dto.review.ReviewRequestDto;
import com.bospital.board.mini_project_hospita_board.domain.entity.Review;
import com.bospital.board.mini_project_hospita_board.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public void saveReview(ReviewRequestDto reviewRequestDto){;
        Review review = reviewRequestDto.toEntity();
        log.info(review.toString());
        reviewRepository.save(review);
    }

    public List<Review> getReviews(Integer id){
        return reviewRepository.findAllByHospitalId(id);
    }
}
