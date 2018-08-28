package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CosmeticVO {
    private Integer cosmetic_id;
    private String name;
    private Integer category_id;
    private String picture;
}
