package com.kosmo.k11security;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	/*
	시큐리티 1단계 기본 페이지 사용
	*/
	@RequestMapping("/security1-1/index.do")
	public String security1_1() {
		
		return "09Security/Step1/index";
	}
	
	@RequestMapping("/security1-2/access.do")
	public String security1_2() {
		
		return "09Security/Step1/access";
	}
	
	/*
	시큐리티 2단계 로그인 화면 커스텀
	*/
	 @RequestMapping("/security2/index.do")
	 public String sequrityIndex2_1(Principal principal, Authentication authentication, Model model) {
		 
		 return "09Security/Step2/index";
	 }
	 
	 @RequestMapping("/security2/login.do")
	 public String sequrityIndex2_2(Model model, Principal principal) {
		 
		 return "09Security/Step2/login";
	 }
	 
	 @RequestMapping("/security2/admin/main.do")
	 public String sequrityIndex2_3() {
		 
		 return "09Security/Step2/adminMain";
	 }
	 
	 @RequestMapping("/security2/accessDenied.do")
	 public String sequrityIndex2_4() {
		 
		 return "09Security/Step2/accessDenied";
	 }
	
}
