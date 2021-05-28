package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.vo.Member;

@Service
public class MemberService {
	@Autowired
	MemberMapper memberMapper;
	
    Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void createMember(Member member) {
		memberMapper.createMember(member);
	}
}
