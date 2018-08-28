package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello2")
    public String hello() {
        return "Hello test";
    }

}
/*
@RestController
public class HelloController {
    private HelloMapper

    @RequestMapping("/hello")
    public ArrayList<MemberVO> hello(){
        MemberVO member = new MemberVO();
        member.setId(1);
        member.setName("Hong kil dong");

        ArrayList<MemberVO> memberList = new ArrayList<>();
        memberList.add(member);
        memberList.add(member);
        return memberList;

    }
    @PostMapping("/hello5")
    public ResultVO hello5(@RequestParam("name") String name) {
        ResultVO result = new ResultVO();
        result.setResult(0);
        result.setMsg(name);
        return result;
    }
    @GetMapping("api/category")
    public List<CategoryVO>
}
*/