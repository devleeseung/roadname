package com.address.roadname.service;

import com.address.roadname.dto.RoadAddressDto;
import com.address.roadname.mapper.RoadAddressMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadAddressService {

    private final RoadAddressMapper roadAddressMapper;

    public RoadAddressService(RoadAddressMapper roadAddressMapper) {
        this.roadAddressMapper = roadAddressMapper;
    }

    public List<RoadAddressDto> searchRoadAddress(
            String sido, String sigungu, String roadName,
            int mainBuildingNo, Integer subBuildingNo
    ) {
        return roadAddressMapper.searchRoadAddress(sido, sigungu, roadName, mainBuildingNo, subBuildingNo);
    }

}