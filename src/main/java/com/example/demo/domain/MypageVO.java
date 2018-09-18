package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MypageVO {
    private Integer mypage_id;
    private String memo;
    private String image;
    private Integer alarm_date;
    private Integer cosmetic_id;
    private Integer member_id;

    public Integer getMypage_id() {
        return mypage_id;
    }

    public void setMypage_id(Integer mypage_id) {
        this.mypage_id = mypage_id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getAlarm_date() {
        return alarm_date;
    }

    public void setAlarm_date(Integer alarm_date) {
        this.alarm_date = alarm_date;
    }

    public Integer getCosmetic_id() {
        return cosmetic_id;
    }

    public void setCosmetic_id(Integer cosmetic_id) {
        this.cosmetic_id = cosmetic_id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }
}