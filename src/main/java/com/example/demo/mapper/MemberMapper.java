package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.Member;

// src/main/resources/mappers¿Í ¿¬°á
@Mapper
public interface MemberMapper {
	void createMember(Member member);
}
