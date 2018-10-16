package com.example.demo.persistence;

import com.example.demo.domain.MypageVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MypageMapper {
    @Insert({"<script>",
            " INSERT INTO mypage(mypage_id,cosmetic_id, member_id,memo,image,add_name,made_date,alarm_date)",
            " VALUES(#{mypage_id}, #{cosmetic_id},#{member_id}, #{memo}, #{image}, #{add_name}, #{made_date},#{alarm_date})",
            "</script>"})

    int insertMypage(MypageVO mypage);
}
