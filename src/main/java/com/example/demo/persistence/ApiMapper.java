package com.example.demo.persistence;

import com.example.demo.domain.MemberVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by eastf on 2017-01-28.
 */
@Repository
@Mapper
public interface ApiMapper {

    @Insert({"<script>",
            " INSERT INTO member(member_id, fcm_id, password, name, created, updated)",
            " VALUES(#{member_id}, #{fcm_id}, #{password}, #{name}, now(), now())",
            "</script>"})
    int addMember(MemberVO member);
}
