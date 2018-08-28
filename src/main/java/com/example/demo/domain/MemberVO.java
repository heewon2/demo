package com.example.demo.domain;

import lombok.Data;

@Data
public class MemberVO {
    private int id;
    private  String name;
    private  int date1; //제조일자
    private  int date2; //유통기한일자
    private  String memo;

}
