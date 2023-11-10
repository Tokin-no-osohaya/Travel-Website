package com.example.demo.form;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginForm {
	/** 識別ID */
	@NotNull
	private String name;
	/** password */
	@NotNull
	private String password;
	
}
