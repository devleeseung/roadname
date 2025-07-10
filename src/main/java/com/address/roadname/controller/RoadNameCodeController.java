package com.address.roadname.controller;

import com.address.roadname.entity.RoadNameCode;
import com.address.roadname.entity.RoadNameCodeId;
import com.address.roadname.repository.RoadNameCodeRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import java.util.List;

@RestController
@RequestMapping("/roadname-code")
public class RoadNameCodeController {

    private final RoadNameCodeRepository repository;

    public RoadNameCodeController(RoadNameCodeRepository repository) {
        this.repository = repository;
    }

    // 도로명 + 시도명으로 검색 (페이징)
    @GetMapping("/roadname/search")
    public Page<RoadNameCode> searchRoadName(
            @RequestParam("road") String road,
            @RequestParam("city") String city,
            @PageableDefault(size = 10) Pageable pageable
    ) {
        return repository.findBy도로명ContainingAnd시도명ContainingAnd읍면동일련번호Not(
                road, city, "00", pageable
        );
    }

    @GetMapping
    public List<RoadNameCode> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{code}/{seq}")
    public RoadNameCode getOne(@PathVariable("code") String code,
                               @PathVariable("seq") String seq) {
        return repository.findById(new RoadNameCodeId(code, seq)).orElse(null);
    }

    @PostMapping
    public RoadNameCode create(@RequestBody RoadNameCode roadNameCode) {
        return repository.save(roadNameCode);
    }
}