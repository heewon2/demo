package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CosmeticVO {
    private Integer cosmetic_id;
    private String name;
    private Integer category_id;
    private String picture;
    private Integer mypage_id;

    public Integer getCosmetic_id() {
        return cosmetic_id;
    }

    public void setCosmetic_id(Integer cosmetic_id) {
        this.cosmetic_id = cosmetic_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getMypage_id() {
        return mypage_id;
    }

    public void setMypage_id(Integer mypage_id) {
        this.mypage_id = mypage_id;
    }
}

