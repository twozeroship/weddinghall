package com.example.weddinghall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/weddinghalls")
public class WeddingHallController {
    /*
     *    이 클래스는 'Controller'라고 불리며, HTTP 요청을 처리하고 응답을 반환합니다. 
     * @RestController 어노테이션은 이 클래스가 RESTful 웹 서비스의 컨트롤러임을 나타냅니다. 
     * 각 메소드는 특정 URL 경로와 HTTP 메소드에 매핑되어 클라이언트의 요청을 처리합니다.
     */


    // @Autowired 어노테이션은 이 필드를 Spring에서 자동으로 주입합니다.
    @Autowired
    // 이 필드는 'WeddingHallRepository' 인터페이스를 구현한 객체를 참조합니다.
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
