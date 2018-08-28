package com.example.demo.controller;

import com.example.demo.domain.CosmeticVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.CosmeticMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CosmeticController {
    @Autowired
    private CosmeticMapper cosmeticMapper;

    @PostMapping("/work")
    public ResultVO addCosmetic(@RequestBody CosmeticVO cosmetic) {
        int result = cosmeticMapper.insertCosmetic(cosmetic);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}
