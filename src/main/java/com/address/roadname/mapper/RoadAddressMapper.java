package com.address.roadname.mapper;

import com.address.roadname.dto.RoadAddressDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoadAddressMapper {
    List<RoadAddressDto> searchRoadAddress(
            @Param("sido") String sido,
            @Param("sigungu") String sigungu,
            @Param("roadName") String roadName,
            @Param("mainBuildingNo") int mainBuildingNo,
            @Param("subBuildingNo") Integer subBuildingNo
    );
}