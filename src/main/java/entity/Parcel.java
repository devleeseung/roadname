package com.address.roadname.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "지번")
@IdClass(ParcelId.class)
@Getter
@Setter
public class Parcel {

    @Id
    private String 관리번호;

    @Id
    private String 일련번호;

    private String 법정동코드;
    private String 시도명;
    private String 시군구명;
    private String 법정읍면동명;
    private String 법정리명;
    private String 산여부;
    private Integer 지번본번_번지;
    private Integer 지번부번_호;
    private String 대표여부;
}