package com.address.roadname.controller;

import com.address.roadname.dto.RoadAddressDto;
import com.address.roadname.service.RoadAddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoadAddressController {

    private final RoadAddressService roadAddressService;

    public RoadAddressController(RoadAddressService roadAddressService) {
        this.roadAddressService = roadAddressService;
    }

    @GetMapping("/road-address/search")
    public List<RoadAddressDto> search(
            @RequestParam("sido") String sido,
            @RequestParam("sigungu") String sigungu,
            @RequestParam("roadName") String roadName,
            @RequestParam("mainBuildingNo") int mainBuildingNo,
            @RequestParam(value = "subBuildingNo", required = false) Integer subBuildingNo
    ) {
        return roadAddressService.searchRoadAddress(sido, sigungu, roadName, mainBuildingNo, subBuildingNo);
    }
}