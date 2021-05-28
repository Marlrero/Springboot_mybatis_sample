package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Member {
	private String id;
	private String pw;
	private String name;
	private String email;
}
