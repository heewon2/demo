package com.example.demo.persistence;

import com.example.demo.domain.CategoryVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CategoryMapper {
    @Insert({"<script>",
            " INSERT INTO category(category_id,category_name,exp_data, exp_data_open)",
            " VALUES(#{category_id}, #{category_name}, #{exp_data}, #{exp_data_open})",
            "</script>"})

    int insertCategory(CategoryVO category);
}
