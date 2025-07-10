package com.address.roadname.entity;

import java.io.Serializable;
import java.util.Objects;

public class ParcelId implements Serializable {

    private String 관리번호;
    private String 일련번호;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParcelId)) return false;
        ParcelId that = (ParcelId) o;
        return Objects.equals(관리번호, that.관리번호) &&
                Objects.equals(일련번호, that.일련번호);
    }

    @Override
    public int hashCode() {
        return Objects.hash(관리번호, 일련번호);
    }
}