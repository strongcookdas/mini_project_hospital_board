package com.bospital.board.mini_project_hospita_board.controller;

import com.bospital.board.mini_project_hospita_board.domain.dto.hospital.HospitalResponseDto;
import com.bospital.board.mini_project_hospita_board.domain.entity.Hospital;
import com.bospital.board.mini_project_hospita_board.repository.HospitalRepository;
import com.bospital.board.mini_project_hospita_board.service.HospitalServicce;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/hospital")
@RequiredArgsConstructor
public class HospitaController {

    private final HospitalRepository hospitalRepository;
    private final HospitalServicce hospitalServicce;

    @GetMapping(value = "")
    public String listHospital(Pageable pageable, Model model){
        Page<Hospital> hospitals = hospitalRepository.findAll(pageable);
        model.addAttribute("hospitals",hospitals);
        model.addAttribute("previous",pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next",pageable.next().getPageNumber());
        return "hospitals/list";
    }

    @GetMapping("/{id}")
    public String getHospital(@PathVariable Integer id, Model model){
        HospitalResponseDto hospitalResponseDto = hospitalServicce.getHospital(id);
        model.addAttribute("hospital",hospitalResponseDto);
        return "hospitals/show";
    }

}
