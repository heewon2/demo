package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigConstant {
    @Value("${upload.root_folder}")
    public String uploadRootFolder;

    @Value("${image_folder}")
    public String image_folder;
}
