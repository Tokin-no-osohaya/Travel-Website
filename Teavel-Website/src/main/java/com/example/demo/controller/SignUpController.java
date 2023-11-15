package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
	//ラジオボタン用変数
	private Map<String, String> radioMarriage;

	//ラジオボタン初期化
	private Map<String, String> initRadioMarrige(){

	Map<String, String> radio = new LinkedHashMap<>();
	return radio;
	}
	@GetMapping("/register")
		public String getSignUp(Model model) {
		//ラジオボタン用の初期化メソッド呼び出し
			radioMarriage = initRadioMarrige();
			//ラジオボタン用のMapをModelに格納
			model.addAttribute("radioMarriage",radioMarriage);
			return "login/register";
	}
		//
	@PostMapping("/register")
		public String postSignUp(Model model) {
		return "redirect:/login";
	}
		
}
