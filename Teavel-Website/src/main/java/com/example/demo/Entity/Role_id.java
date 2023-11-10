package com.example.demo.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Role_id {
	@Id
	private Integer id;
	private String name;
}
