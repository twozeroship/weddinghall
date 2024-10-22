package com.example.weddinghall;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity 어노테이션은 이 클래스가 데이터베이스 테이블과 매핑됨을 나타냅니다.
@Entity
public class WeddingHall {
    /*
     *    이 클래스는 '엔티티(Entity)'라고 불립니다. 
     * 데이터베이스의 테이블과 매핑되는 Java 객체를 나타냅니다. 
     * 각 필드는 테이블의 열에 해당하며, 객체의 인스턴스는 테이블의 행에 해당합니다. 
     * @Entity 어노테이션은 이 클래스가 JPA 엔티티임을 나타냅니다.
     */


    // @Id 어노테이션은 이 필드가 테이블의 기본 키임을 나타냅니다.
    @Id
    // @GeneratedValue는 기본 키 값을 자동으로 생성하도록 지정합니다.
    // IDENTITY 전략은 데이터베이스가 자동으로 ID를 증가시키는 것을 의미합니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // 웨딩홀의 이름을 저장하는 필드입니다.
    private String name;
    
    // 웨딩홀의 위치를 저장하는 필드입니다.
    private String location;

    // 기본 생성자입니다. JPA에서 엔티티 객체를 생성할 때 사용합니다.
    public WeddingHall() {}

    // 이름과 위치를 받는 생성자입니다. 새로운 웨딩홀 객체를 만들 때 사용할 수 있습니다.
    public WeddingHall(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // 이하는 getter와 setter 메소드들입니다.
    // 이 메소드들은 private 필드에 접근하고 수정하는 데 사용됩니다.

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
