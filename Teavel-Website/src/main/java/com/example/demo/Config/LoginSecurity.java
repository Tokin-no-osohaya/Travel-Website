package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class LoginSecurity {
    @Bean
    DefaultSecurityFilterChain signinSecurity(HttpSecurity http) throws Exception{
		http
		.formLogin(form -> form
			//ログイン処理のパス
			.loginProcessingUrl("/login")
			//ログインページ
			.loginPage("/login")
			//ログインエラー時の遷移先
			.failureUrl("/login?error")
			//ログイン成功時の遷移先
			.defaultSuccessUrl("/menu",true)
			//ログイン時のキー：id
			.usernameParameter("id")
			//ログイン時のパスワード
			.passwordParameter("password")
			// ログイン画面は未ログインでもアクセス可能
			.permitAll() 
		).logout(logout -> logout
			//ログアウト時の遷移先
			.logoutSuccessUrl("/login?logout")
		).authorizeHttpRequests(authz -> authz
			// 「/login」はすべて許可
			.requestMatchers("/login").permitAll()
			// 他の URL はログイン後のみアクセス可能
			.anyRequest().authenticated()
			);
			return http.build();
	}
}
