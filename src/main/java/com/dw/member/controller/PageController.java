package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



//@Controller → 페이지이동
@Controller
public class PageController {

	@GetMapping("/members")
	public String callMemberPage() {
		return "member";
	}

	@GetMapping("/login")
	public String loadLoginPage() {
		return "login";
	}

	@GetMapping("/upload")
    public String loadUploadPage() {
        return "upload";
    }

	// @GetMapping(value = {"/","/home"})
	// public String loadHomePage() {
	// 	return "member";
	// }

	@GetMapping(value = { "/", "/home" })
   	public String loadHomePage() {
      return "member";
   }


	
}
