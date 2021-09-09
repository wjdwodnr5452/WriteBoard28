package com.lec.spring.test;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.ResponseBody;

@Mapper
public interface StudentDao {
	// 목록 읽어오기 가능
	@Select("SELECT * FROM t_student")
	List<StudentDTO> list();
	
	// 어떠한 쿼리문도 가능.
	@Select("SELECT s.name sname, d.dname dname FROM t_student s, t_department d WHERE s.deptno1 = d.deptno")
	List<StuDeptDTO> studept();
	
	// 값 한개 SELECT 가능
	@Select("SELECT count(*) FROM t_student")
	int stuCount();  // 한개명 해당 타입으로 받아올수 있다.
	
	// 쿼리에 파라미터도 건네줄수 있다.
	@Select("SELECT * FROM t_student WHERE studno = #{studno}")
	StudentDTO singleStu(int studno);
	
	// DML
	@Update("UPDATE t_emp SET sal = sal + 1")
	int updateSal();
	
}







