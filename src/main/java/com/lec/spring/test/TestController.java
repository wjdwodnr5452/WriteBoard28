package com.lec.spring.test;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test/")
public class TestController {
	
	@Autowired
	private StudentDao stuDao;  // MyBais 가 컨테이너에 생성
	
	@ResponseBody  // 직접 문자열 response
	@GetMapping("body1")
	public String body1() {
		return "<h2>이것이 ResponseBody닷!</h2>";
	}
		
	@ResponseBody  
	@GetMapping("stulist")
	public String list() {
		List<StudentDTO> list = stuDao.list();
		return list.toString();
	}
	
	@ResponseBody  
	@GetMapping("studept")
	public String studept() {		
		return stuDao.studept().toString();
	}
	
	
	@ResponseBody  // 직접 문자열 response
	@GetMapping("stu1")
	public String singleStu(int studno) {
		StudentDTO dto = stuDao.singleStu(studno);
		return dto.toString();
	}
	
	@ResponseBody
	@GetMapping("stucount")
	public String stuCount() {
		return "" + stuDao.stuCount() + "명";
	}
	
	@ResponseBody
	@GetMapping("updateSal")
	public String updateSal() {
		return "" + stuDao.updateSal() + "명 급여 인상";
	}
	
}











