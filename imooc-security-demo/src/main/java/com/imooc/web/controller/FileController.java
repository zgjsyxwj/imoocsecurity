package com.imooc.web.controller;

import com.imooc.dto.FileInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping
    public FileInfo uppload(MultipartFile file) throws Exception{
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());
        String folder="/Users/seed/IdeaProjects/imoocsecurity/imooc-security-demo/src/main/java/com/imooc/web/controller/";
        File localFile=new File(folder,new Date().getTime()+".txt");
        file.transferTo(localFile);
        return new FileInfo(localFile.getAbsolutePath());
    }
}
