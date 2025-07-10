package com.address.roadname.entity;

import java.io.Serializable;
import java.util.Objects;

public class RoadNameCodeId implements Serializable {

    private String 도로명코드;
    private String 읍면동일련번호;

    // ⭐ 기본 생성자
    public RoadNameCodeId() {
    }

    // ⭐ 필드 두 개를 받는 생성자
    public RoadNameCodeId(String 도로명코드, String 읍면동일련번호) {
        this.도로명코드 = 도로명코드;
        this.읍면동일련번호 = 읍면동일련번호;
    }

    // ⭐ getter/setter (JPA가 사용)
    public String get도로명코드() {
        return 도로명코드;
    }

    public void set도로명코드(String 도로명코드) {
        this.도로명코드 = 도로명코드;
    }

    public String get읍면동일련번호() {
        return 읍면동일련번호;
    }

    public void set읍면동일련번호(String 읍면동일련번호) {
        this.읍면동일련번호 = 읍면동일련번호;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoadNameCodeId)) return false;
        RoadNameCodeId that = (RoadNameCodeId) o;
        return Objects.equals(도로명코드, that.도로명코드) &&
                Objects.equals(읍면동일련번호, that.읍면동일련번호);
    }

    @Override
    public int hashCode() {
        return Objects.hash(도로명코드, 읍면동일련번호);
    }
}