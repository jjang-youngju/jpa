package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//@Controller → 페이지이동
@Controller
public class PageController {

	@GetMapping("/member")
	public String callMemberPage() {
		return "member";
	}

	@GetMapping("/login")
	public String loadLogintPage() {
		return "login";
	}
	
}
