package com.address.roadname.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "도로명주소")
public class Roadname {
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

    // Getters & Setters
    public String get관리번호() { return 관리번호; }
    public void set관리번호(String 관리번호) { this.관리번호 = 관리번호; }

    public String get도로명코드() { return 도로명코드; }
    public void set도로명코드(String 도로명코드) { this.도로명코드 = 도로명코드; }

    public String get읍면동일련번호() { return 읍면동일련번호; }
    public void set읍면동일련번호(String 읍면동일련번호) { this.읍면동일련번호 = 읍면동일련번호; }

    public String get지하여부() { return 지하여부; }
    public void set지하여부(String 지하여부) { this.지하여부 = 지하여부; }

    public Integer get건물본번() { return 건물본번; }
    public void set건물본번(Integer 건물본번) { this.건물본번 = 건물본번; }

    public Integer get건물부번() { return 건물부번; }
    public void set건물부번(Integer 건물부번) { this.건물부번 = 건물부번; }

    public String get기초구역번호() { return 기초구역번호; }
    public void set기초구역번호(String 기초구역번호) { this.기초구역번호 = 기초구역번호; }

    public String get변경사유코드() { return 변경사유코드; }
    public void set변경사유코드(String 변경사유코드) { this.변경사유코드 = 변경사유코드; }

    public String get고시일자() { return 고시일자; }
    public void set고시일자(String 고시일자) { this.고시일자 = 고시일자; }

    public String get변경전_도로명주소() { return 변경전_도로명주소; }
    public void set변경전_도로명주소(String 변경전_도로명주소) { this.변경전_도로명주소 = 변경전_도로명주소; }

    public String get상세주소_부여여부() { return 상세주소_부여여부; }
    public void set상세주소_부여여부(String 상세주소_부여여부) { this.상세주소_부여여부 = 상세주소_부여여부; }
}