package com.example.demo.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserLogin {
	@Id
	/** 名前 */
	private String username;
	/** パスワード */
	private String password;
	/** 識別ID */
	private Integer role_id;
}
