package com.xuecheng.manage_media.dao;

import com.xuecheng.framework.domain.media.MediaFile;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
* @name: MediaFileRepository
*
* @description: 媒体文件的操作
*
* @author: Yifan Zheng
*
* @Date: 2020/3/5
*
* @Version：1.0
**/
public interface MediaFileRepository extends MongoRepository<MediaFile,String> {


}
