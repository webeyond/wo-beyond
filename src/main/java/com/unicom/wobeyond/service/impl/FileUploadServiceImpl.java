package com.unicom.wobeyond.service.impl;

import com.unicom.wobeyond.mapper.ProdMapper;
import com.unicom.wobeyond.model.Prod;
import com.unicom.wobeyond.service.FileUploadService;
import com.unicom.wobeyond.util.WoBeyondUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Autowired
    private ProdMapper prodMapper;

    public String saveImage(MultipartFile file) throws IOException {
        int dotPos = file.getOriginalFilename().lastIndexOf(".");
        if (dotPos < 0) {
            return null;
        }
        String fileExt = file.getOriginalFilename().substring(dotPos + 1).toLowerCase();
        if (!WoBeyondUtil.isFileAllowed(fileExt)) {
            return null;
        }

        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fileExt;
        Files.copy(file.getInputStream(), new File(WoBeyondUtil.IMAGE_DIR + fileName).toPath(),
                StandardCopyOption.REPLACE_EXISTING);
        Prod prod = new Prod();
        prod.setDesPic(fileName);
        prodMapper.insertSelective(prod);
        return WoBeyondUtil.WoBeyond_DOMAIN + "image?name=" + fileName;
    }


}
