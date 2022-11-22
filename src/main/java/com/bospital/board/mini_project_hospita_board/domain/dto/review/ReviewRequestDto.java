package com.bospital.board.mini_project_hospita_board.domain.dto.review;


import com.bospital.board.mini_project_hospita_board.domain.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ReviewRequestDto {

    private Integer id;
    private String title;
    private String content;

    private String patientName;

    public Review toEntity(){
        return new Review(this.id,this.title,this.content,this.patientName);
    }
}
