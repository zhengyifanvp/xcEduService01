package com.xuecheng.filesystem.dao;

import com.xuecheng.framework.domain.filesystem.FileSystem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
* @name: FileSystemRepository
*
* @description: 文件系统相关的dao
*
* @author: Yifan Zheng
*
* @Date: 2020/2/14
*
* @Version：1.0
**/
public interface FileSystemRepository extends MongoRepository<FileSystem,String> {
}
