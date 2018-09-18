package com.example.demo.controller;

import com.example.demo.domain.MemberVO;
import com.example.demo.domain.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.persistence.ApiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiMapper memberMapper;

    @PostMapping("/addMember")
    public ResultVO addMember(@RequestBody MemberVO member) {
        int result = memberMapper.addMember(member);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}