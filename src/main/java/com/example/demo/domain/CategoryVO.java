package com.example.demo.domain;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class CategoryVO {
    private Integer category_id;
    private String category_name;
    private Integer exp_data;
    private Integer exp_data_open;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Integer getExp_data() {
        return exp_data;
    }

    public void setExp_data(Integer exp_data) {
        this.exp_data = exp_data;
    }

    public Integer getExp_data_open() {
        return exp_data_open;
    }

    public void setExp_data_open(Integer exp_data_open) {
        this.exp_data_open = exp_data_open;
    }
}
