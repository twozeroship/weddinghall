package com.example.weddinghall;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository 어노테이션은 이 인터페이스가 저장소 역할을 한다는 것을 Spring에 알려줍니다.
@Repository
// JpaRepository를 상속받아 기본적인 CRUD 연산을 자동으로 제공받습니다.
// <WeddingHall, Long>에서 WeddingHall은 엔티티 타입, Long은 엔티티의 ID 타입입니다.
public interface WeddingHallRepository extends JpaRepository<WeddingHall, Long> {
    /*
     *    이 인터페이스는 'Repository'라고 불리며, 데이터베이스 작업을 추상화합니다. 
     * JpaRepository를 상속받아 기본적인 CRUD(Create, Read, Update, Delete) 연산을 자동으로 제공받습니다. 
     * 이를 통해 데이터베이스 작업을 더 쉽게 수행할 수 있습니다.
     */

    // 여기에 추가적인 쿼리 메소드를 정의할 수 있습니다.
    // 예: List<WeddingHall> findByLocation(String location);
}
