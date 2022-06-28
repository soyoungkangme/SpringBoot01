package com.rubypaper;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication  // @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan 포함하는 어노테이션 
@ComponentScan(basePackages = {"com.rubypaper", "com.test"})   // 메인 클래스가 들어있는 패키지 + 다른 패키지까지 ComponentScan 범위에 넣기 위해 재정의 
public class SpringBoot01Application {

	public static void main(String[] args) {
		
		// 웹(스프링부트)으로 구동할때
		// SpringApplication.run(Chapter01Application.class, args);  또는
		SpringApplication application = new SpringApplication(SpringBoot01Application.class);  
		application.setWebApplicationType(WebApplicationType.SERVLET);   // # 자바 설정보다 프로퍼티 설정이 우선순위 제일 높음
		application.setBannerMode(Banner.Mode.OFF);   // 콘솔에 배너 출력 끄기 
		application.run(args);
		
		/* 자바로 구동할때 (톰캣 실행X) 
		SpringApplication application = new SpringApplication(Chapter01Application.class);  // 자기자신을 인자로 전달 
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
		*/
		
	}

}


//스프링 부트로 실행하면 내부적으로 톰캣 서버가 포트 번호 8080으로 시작 
//콘솔이 깨끗해야 (8080 죽어있어야) 잘 구동됨 (포트 충돌X) 
//수정시 자동으로 로딩되는건 devtools 라이브러리 덕분
