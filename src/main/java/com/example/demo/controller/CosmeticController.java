package com.example.demo.controller;

import com.example.demo.ConfigConstant;
import com.example.demo.domain.CosmeticVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.CosmeticMapper;
//import jdk.javadoc.internal.tool.Main;
import lombok.AllArgsConstructor;
//import org.junit.runner.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MultipartFilter;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")


public class CosmeticController {
    @Autowired
    private ConfigConstant configConstant;
    private CosmeticMapper cosmeticMapper;

    @PostMapping("/cosmetic")
    public ResultVO addCosmetic(@RequestBody CosmeticVO cosmetic) {
        int result = cosmeticMapper.insertCosmetic(cosmetic);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
    @PostMapping("/file1")
    public ResultVO fileUpload(@RequestPart(value="file1") MultipartFile file) {
        try {
            // 이미지가 있는지 체크
            if (file != null) {
                //업로드할 디렉토리가 있는지 체크
                String path = configConstant.uploadRootFolder + configConstant.image_folder;
                File dir = new File(path);
                if (!dir.isDirectory()) {
                    dir.mkdirs();
                }
                // 파일 저장: 파일명은 중복을 피하기 위해서 파일명 _타임스템프
                String filename = file.getOriginalFilename();
                String savedFilename = filename.substring(0, filename.lastIndexOf(".")) + "_" +
                        System.currentTimeMillis() + filename.substring(filename.lastIndexOf("."));
                File saveFile = new File(path, savedFilename);
                file.transferTo(saveFile);

                return new ResultVO(0,configConstant.image_folder+"/"+savedFilename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResultVO(500,"internel server error");
    }
}