package com.example.demo.persistence;

import com.example.demo.domain.CosmeticVO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface CosmeticMapper {
    @Insert({"<script>",
            " INSERT INTO work(cosmetic_id,name,category_id,picture,mypage_id,created)",
            " VALUES(#{cosmetic_id}, #{name}, #{category_id}, #{picture}, #{mypage_id},now())",
            "</script>"})
    int insertCosmetic(CosmeticVO cosmetic);
}
