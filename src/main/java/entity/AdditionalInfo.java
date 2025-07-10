package com.address.roadname.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "부가정보")
@Getter
@Setter
public class AdditionalInfo {

    @Id
    private String 관리번호;

    private String 행정동코드;
    private String 행정동명;
    private String 우편번호;
    private String 우편번호_일련번호;
    private String 다량배달처명;
    private String 건축물대장_건물명;
    private String 시군구_건물명;
    private String 공동주택여부;
}