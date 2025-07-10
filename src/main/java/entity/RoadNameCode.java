package com.address.roadname.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "도로명코드")
@IdClass(RoadNameCodeId.class)
@Getter
@Setter
public class RoadNameCode {

    @Id
    private String 도로명코드;

    @Id
    private String 읍면동일련번호;

    private String 도로명;
    private String 도로명_로마자;
    private String 시도명;
    private String 시도명_로마자;
    private String 시군구명;
    private String 시군구명_로마자;
    private String 읍면동명;
    private String 읍면동명_로마자;
    private String 읍면동구분;
    private String 읍면동코드;
    private String 사용여부;
    private String 변경사유;
    private String 변경이력정보;
    private String 고시일자;
    private String 말소일자;
}