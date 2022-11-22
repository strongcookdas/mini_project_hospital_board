package com.bospital.board.mini_project_hospita_board.service;


import com.bospital.board.mini_project_hospita_board.domain.dto.hospital.HospitalResponseDto;
import com.bospital.board.mini_project_hospita_board.domain.entity.Hospital;
import com.bospital.board.mini_project_hospita_board.repository.HospitalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

class HospitalServicceTest {

    private HospitalRepository hospitalRepository = Mockito.mock(HospitalRepository.class);

    private HospitalServicce hospitalServicce;

    @BeforeEach
    void setup() {
        hospitalServicce = new HospitalServicce(hospitalRepository);
    }

    @Test
    @DisplayName("3일때 폐업")
    void businessStatusName3() {
        Hospital hospital = Hospital.builder()
                .id(1)
                .businessStatusCode(3)
                .build();

        Mockito.when(hospitalRepository.findById(any()))
                .thenReturn(Optional.of(hospital));

        HospitalResponseDto hospitalResponseDto = hospitalServicce.getHospital(1);

        assertEquals("폐업", hospitalResponseDto.getBusinessStatusCode());
    }

    @Test
    @DisplayName("13일때 영업중")
    void businessStatusName13() {
        Hospital hospital = Hospital.builder()
                .id(2)
                .businessStatusCode(13)
                .build();

        Mockito.when(hospitalRepository.findById(any()))
                .thenReturn(Optional.of(hospital));

        HospitalResponseDto hospitalResponseDto = hospitalServicce.getHospital(2);
        assertEquals("영업중", hospitalResponseDto.getBusinessStatusCode());
    }
}