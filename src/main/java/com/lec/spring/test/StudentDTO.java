package com.lec.spring.test;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StudentDTO {
	int studno;
	String name;
	String id;
	int grade;  // 학년
	LocalDate birthday;  // 시간타입
	String nick;  // 없는 건 매핑 안된다.
	
}
