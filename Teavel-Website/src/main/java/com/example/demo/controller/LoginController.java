package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	// ログイン画面を表示する 
	@GetMapping("login")
	public String loginview() {
		return "login";
	}
	//Getメソッド
	@GetMapping("/login")
	public String getLogin(Model model) {
		return "login/login";
	}
	//Postメソッド
	@PostMapping("login")
	public String postLogin(Model model) {
		return "login/login";
	}
	// SecurityConfig のfailureUrl で指定した URL と?のうしろのパラメータ
	@GetMapping(value="/login", params="error")
	public String loginFail(Model model) {
	model.addAttribute("errorMessage", "ログインに失敗しました");
	// ログイン画面を表示
	return "login";
	}
	// SecurityConfig の defaultSuccessUrl で指定した URL
	@GetMapping("loginsuccess")
	public String loginSuccess() {
	// ログインに成功したら表示する URL
	return "success";
	}
	//新規登録画面
	@GetMapping("")
	public String signUp() {
	return "register";
	}

}
