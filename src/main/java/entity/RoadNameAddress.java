package com.address.roadname.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "도로명주소")
@Getter
@Setter
public class RoadNameAddress {

    @Id
    private String 관리번호;

    private String 도로명코드;
    private String 읍면동일련번호;
    private String 지하여부;
    private Integer 건물본번;
    private Integer 건물부번;
    private String 기초구역번호;
    private String 변경사유코드;
    private String 고시일자;
    private String 변경전_도로명주소;
    private String 상세주소_부여여부;
}