package com.example.demo.controller;
import com.example.demo.domain.MypageVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.MypageMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api")
public class MypageController {
    @Autowired
    private MypageMapper mypageMapper;
    @PostMapping("/mypage")
    public ResultVO addCosmetic(@RequestBody MypageVO mypage) {
        int result = mypageMapper.insertMypage(mypage);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}