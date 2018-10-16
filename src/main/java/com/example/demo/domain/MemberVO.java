package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.print.DocFlavor;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberVO {
    private Integer member_id;
    private Integer fcm_id;
    private String password;
    private String name;
    private String created;
    private String updated;

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getFcm_id() {
        return fcm_id;
    }

    public void setFcm_id(Integer fcm_id) {
        this.fcm_id = fcm_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
