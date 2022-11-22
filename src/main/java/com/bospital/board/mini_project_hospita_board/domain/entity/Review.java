package com.bospital.board.mini_project_hospita_board.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "review")
@NoArgsConstructor
@Getter
@ToString
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer hospitalId;
    private String title;
    private String content;
    private String patientName;

    public Review(Integer hospitalId, String title, String content, String patientName) {
        this.hospitalId = hospitalId;
        this.title = title;
        this.content = content;
        this.patientName = patientName;
    }
}
