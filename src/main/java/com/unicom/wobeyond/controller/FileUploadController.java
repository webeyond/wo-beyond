package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.service.FileUploadService;
import com.unicom.wobeyond.util.WoBeyondUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Api(value = "FileUploadController",description = "上传文件接口")
public class FileUploadController {

    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Autowired
    private FileUploadService fileUploadService;

    @RequestMapping(path = {"/uploadImage/"}, method = {RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value="上传图片接口", response = String.class)
    public String uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            String fileUrl = fileUploadService.saveImage(file);
            if (fileUrl == null) {
                return WoBeyondUtil.getJSONString(1, "上传图片失败");
            }
            return WoBeyondUtil.getJSONString(0, fileUrl);
        } catch (Exception e) {
            logger.error("上传图片失败" + e.getMessage());
            return WoBeyondUtil.getJSONString(1, "上传失败");
        }
    }
}
