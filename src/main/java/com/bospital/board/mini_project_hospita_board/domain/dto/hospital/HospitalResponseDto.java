package com.bospital.board.mini_project_hospita_board.domain.dto.hospital;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HospitalResponseDto {

    private Integer id;
    private String openServiceName;
    private String businessStatusCode;
    private String phone;
    private String fullAddress;
    private String roadNameAddress;
    private String hospitalName;
    private String businessTypeName;

    private Integer healthcareProviderCount;
    private Integer patientRoomCount;
    private Integer totalNumberOfBeds;
    private Float totalAreaSize;


    public HospitalResponseDto(Integer id, String openServiceName, String phone, String fullAddress, String roadNameAddress, String hospitalName, String businessTypeName, Integer healthcareProviderCount, Integer patientRoomCount, Integer totalNumberOfBeds, Float totalAreaSize) {
        this.id = id;
        this.openServiceName = openServiceName;
        this.phone = phone;
        this.fullAddress = fullAddress;
        this.roadNameAddress = roadNameAddress;
        this.hospitalName = hospitalName;
        this.businessTypeName = businessTypeName;
        this.healthcareProviderCount = healthcareProviderCount;
        this.patientRoomCount = patientRoomCount;
        this.totalNumberOfBeds = totalNumberOfBeds;
        this.totalAreaSize = totalAreaSize;
    }
}
