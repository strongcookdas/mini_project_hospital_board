package com.bospital.board.mini_project_hospita_board.service;

import com.bospital.board.mini_project_hospita_board.domain.dto.hospital.HospitalResponseDto;
import com.bospital.board.mini_project_hospita_board.domain.entity.Hospital;
import com.bospital.board.mini_project_hospita_board.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HospitalServicce {

    private final HospitalRepository hospitalRepository;



    public HospitalResponseDto getHospital(Integer id){
        HospitalResponseDto hospitalResponseDto = null;
        Optional<Hospital> optionalHospital = hospitalRepository.findById(id);
        if(!optionalHospital.isEmpty()){
            hospitalResponseDto = optionalHospital.get().toResponseDto();
            switch (optionalHospital.get().getBusinessStatusCode()){
                case 13:
                    hospitalResponseDto.setBusinessStatusCode("영업중");
                    break;
                case 3:
                    hospitalResponseDto.setBusinessStatusCode("폐업");
                    break;
                default:
                    hospitalResponseDto.setBusinessStatusCode(String.valueOf(optionalHospital.get().getBusinessStatusCode()));
            }
        }
        return hospitalResponseDto;
    }
}
