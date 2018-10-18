package com.unicom.wobeyond.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface FileUploadService {

    String saveImage(MultipartFile file) throws IOException;

}
