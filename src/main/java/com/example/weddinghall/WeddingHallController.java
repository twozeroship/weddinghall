package com.example.weddinghall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/weddinghalls")
public class WeddingHallController {

    @Autowired
    private WeddingHallRepository weddingHallRepository;

    // 웨딩홀 추가
    @PostMapping
    public WeddingHall addWeddingHall(@RequestBody WeddingHall weddingHall) {
        return weddingHallRepository.save(weddingHall);
    }

    // 웨딩홀 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWeddingHall(@PathVariable Long id) {
        Optional<WeddingHall> weddingHall = weddingHallRepository.findById(id);
        if (weddingHall.isPresent()) {
            weddingHallRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // 웨딩홀 목록 조회
    @GetMapping
    public List<WeddingHall> getAllWeddingHalls() {
        return weddingHallRepository.findAll();
    }

    
}
