package com.xuecheng.api.filesystem;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;
/**
* @name: FileSystemControllerApi
*
* @description: 文件系统的接口
*
* @author: Yifan Zheng
*
* @Date: 2020/2/14
*
* @Version：1.0
**/
@Api(value = "文件管理接口",description = "文件管理接口。提供文件的增、删、查、改")
public interface FileSystemControllerApi {
    /**
     * 上传文件
     * @param multipartFile 文件
     * @param filetag 文件标签
     * @param businesskey 业务key
     * @param metadata 元信息,json格式
     * @return
     */
    @ApiOperation("上传文件接口")
    public UploadFileResult upload(MultipartFile multipartFile,
                                   String filetag,
                                   String businesskey,
                                   String metadata);
}

