package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.MemberService;
import com.example.demo.vo.Member;

@Controller
public class GameController {
    @Autowired
    MemberService memberService;
    
    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/game/test")
    public String test() {
    	Member member = new Member("test", "test", "test_name", "test@test.com");
    	memberService.createMember(member);
    	
    	return "Hello!";
    }
    
    @GetMapping("/game/game1") //��Ʈ����
    public String dispGame(){
        return  "game/game1";
    }

    @GetMapping("/game/join")//ȸ������
    public String dispJoin(Member member) {
    	return  "game/join"; 
    }

    @GetMapping("/game/main") //����ȭ��
    public String dispMain(){return  "game/main"; }

    @GetMapping("/game/ra") //ȸ������
    public String dispRa(){
        return  "game/ra";
    }

    @GetMapping("/game/ranking")
    public String dispRanking(){
        return  "game/ranking";
    }

    @PostMapping("game/createUser")
    public String createUser(Member member){
    	memberService.createMember(member);

        return "game/main";
    }


    //�α��� ȭ�� ����
}
