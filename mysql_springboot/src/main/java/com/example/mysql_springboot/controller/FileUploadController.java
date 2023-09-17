package com.example.mysql_springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String upload(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println("nickname: " + nickname);
        System.out.println("photo: " + photo.getOriginalFilename());
        System.out.println("photo: " + photo.getSize());
        System.out.println("photo: " + photo.getContentType());
//        String path = request.getServletContext().getRealPath("/upload/");
//        设置上传文件的保存地址目录：
        String path = "C://Users\\Stupidsheep\\Desktop\\CURRENT\\springboot_source\\upload\\";
        System.out.println("path: " + path);
        saveFile(photo, path);
        return "upload";
    }

    private void saveFile(MultipartFile photo, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, Objects.requireNonNull(photo.getOriginalFilename()));
        photo.transferTo(file);
    }
}
