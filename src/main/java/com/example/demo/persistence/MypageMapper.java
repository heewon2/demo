package com.example.demo.persistence;

import com.example.demo.domain.MypageVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MypageMapper {
    @Insert({"<script>",
            " INSERT INTO mypage(mypage_id,memo,image, alarm_date, cosmetic_id, member_id)",
            " VALUES(#{mypage_id}, #{memo}, #{image}, #{alarm_date}, #{cosmetic_id},#{member_id})",
            "</script>"})

    int insertMypage(MypageVO mypage);
}
