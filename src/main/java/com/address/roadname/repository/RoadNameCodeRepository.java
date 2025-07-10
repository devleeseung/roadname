package com.address.roadname.repository;

import com.address.roadname.entity.RoadNameCode;
import com.address.roadname.entity.RoadNameCodeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface RoadNameCodeRepository extends JpaRepository<RoadNameCode, RoadNameCodeId> {
    // 도로명 + 시도명으로 LIKE 검색
    Page<RoadNameCode> findBy도로명ContainingAnd시도명ContainingAnd읍면동일련번호Not(
            String road, String city, String 읍면동일련번호, Pageable pageable);
}