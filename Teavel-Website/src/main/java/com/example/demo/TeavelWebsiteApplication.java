package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TeavelWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeavelWebsiteApplication.class, args);
		//.getBean(TeavelWebsiteApplication.class).ex();
	}
//	@Autowired
//	PasswordEncoder e;
//
//	private void ex() {
//		System.out.println(e.encode("pass"));
//	}

}
