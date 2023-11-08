package com.example.demo.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	/** ログイン画面を表示する */
	@GetMapping("login")
	public String loginview() {
		return "login";
	}
	/** 認証処理 */
	public void LoginUserDate(Login login,String role){
		super(login.)
	}
}
