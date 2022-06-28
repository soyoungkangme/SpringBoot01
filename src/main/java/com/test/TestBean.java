package com.test;

import org.springframework.stereotype.Service;

@Service   // 리로딩 후 생성 안됨 -> 메인 클래스가 들어있는 패키지만 ComponentScan 범위 
public class TestBean {
	
	public TestBean() {
		System.out.println("===> TestBean 생성");    
	}

}
