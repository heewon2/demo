package com.example.demo.controller;
import com.example.demo.domain.CategoryVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.CategoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryMapper categoryMapper;

    @PostMapping("/category")
    public ResultVO addCategory(@RequestBody CategoryVO category) {
        int result = categoryMapper.insertCategory(category);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}