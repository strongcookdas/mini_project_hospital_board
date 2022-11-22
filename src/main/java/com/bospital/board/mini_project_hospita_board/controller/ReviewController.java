package com.bospital.board.mini_project_hospita_board.controller;

import com.bospital.board.mini_project_hospita_board.domain.dto.review.ReviewRequestDto;
import com.bospital.board.mini_project_hospita_board.domain.entity.Review;
import com.bospital.board.mini_project_hospita_board.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/review")
@RequiredArgsConstructor
@Slf4j
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping("/new")
    public String writeReview(ReviewRequestDto reviewRequestDto, Model model){
        log.info(reviewRequestDto.toString());
        reviewService.saveReview(reviewRequestDto);
        return "redirect:/hospital/"+reviewRequestDto.getId();
    }
}
