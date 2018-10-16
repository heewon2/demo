package com.example.demo;

import com.example.demo.domain.MemberVO;
import com.example.demo.persistence.ApiMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by eastf on 2017-01-28.
 */
//@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiMapperTest {
//    @Autowired
//    private ApiMapper mapper;

   @Ignore
   @Test
    public void addMember() {
        MemberVO member = new MemberVO();
        member.setMember_id(11);
        member.setPassword("1234");
        member.setName("ccc");
        System.out.print(member);
//        int count = mapper.addMember(member);
//        assertThat(count).isEqualTo(1);
    }
}
