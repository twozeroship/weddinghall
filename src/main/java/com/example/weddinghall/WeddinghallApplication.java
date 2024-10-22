package com.example.weddinghall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 어노테이션은 이 클래스가 Spring Boot 애플리케이션의 주 클래스임을 나타냅니다.
// 이 어노테이션은 @Configuration, @EnableAutoConfiguration, @ComponentScan을 포함합니다.
@SpringBootApplication
public class WeddinghallApplication {
    /*
	 *    이것은 스프링 부트 애플리케이션의 메인 클래스입니다. 
	 * @SpringBootApplication 어노테이션은 이 클래스가 스프링 부트 애플리케이션의 시작점임을 나타냅니다. 
	 * 이 클래스의 main 메소드는 애플리케이션을 실행하는 데 사용됩니다.
	 */


	// 메인 메소드는 애플리케이션의 진입점입니다.
	public static void main(String[] args) {
		// SpringApplication.run() 메소드는 Spring 애플리케이션을 시작합니다.
		SpringApplication.run(WeddinghallApplication.class, args);
	}
}
