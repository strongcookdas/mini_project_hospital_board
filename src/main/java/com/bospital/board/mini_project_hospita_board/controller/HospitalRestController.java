package com.bospital.board.mini_project_hospita_board.controller;

import com.bospital.board.mini_project_hospita_board.domain.dto.hospital.HospitalResponseDto;
import com.bospital.board.mini_project_hospita_board.service.HospitalServicce;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hospital")
@RequiredArgsConstructor
public class HospitalRestController {

    private final HospitalServicce hospitalServicce;

    @GetMapping("/{id}")
    public ResponseEntity<HospitalResponseDto> getHospital(@PathVariable Integer id){
        return ResponseEntity.ok().body(hospitalServicce.getHospital(id));
    }
}
