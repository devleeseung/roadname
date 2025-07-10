package com.address.roadname.dto;

import lombok.Data;

@Data
public class RoadAddressDto {
    private String zipCode;      // 새우편번호
    private String roadAddress;  // 도로명주소
    private String jibunAddress; // 지번주소
}