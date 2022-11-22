package com.bospital.board.mini_project_hospita_board.domain.entity;


import com.bospital.board.mini_project_hospita_board.domain.dto.hospital.HospitalResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nation_wide_hospitals")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hospital {
    @Id
    private Integer id;

    private String openServiceName;
    private Integer businessStatusCode;
    private String phone;
    private String fullAddress;
    private String roadNameAddress;
    private String hospitalName;
    private String businessTypeName;

    private Integer healthcareProviderCount;
    private Integer patientRoomCount;
    private Integer totalNumberOfBeds;
    private Float totalAreaSize;

    public HospitalResponseDto toResponseDto(){
        return new HospitalResponseDto(this.id,this.openServiceName,this.phone,this.fullAddress,this.roadNameAddress,
                this.hospitalName,this.businessTypeName,this.healthcareProviderCount,this.patientRoomCount,this.totalNumberOfBeds,this.totalAreaSize);
    }
}
