package com.xuecheng.manage_media_process.dao;

import com.xuecheng.framework.domain.media.MediaFile;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
* @name: MediaFileRepository
*
* @description: 媒体文件的dao
*
* @author: Yifan Zheng
*
* @Date: 2020/3/12
*
* @Version：1.0
**/
public interface MediaFileRepository extends MongoRepository<MediaFile,String> {
}
