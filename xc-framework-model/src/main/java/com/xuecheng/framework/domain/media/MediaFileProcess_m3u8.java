package com.xuecheng.framework.domain.media;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @name: MediaFileProcess_m3u8
*
* @description: m3u8数据模型列表
*
* @author: Yifan Zheng
*
* @Date: 2020/3/5
*
* @Version：1.0
**/
@Data
@ToString
public class MediaFileProcess_m3u8 extends MediaFileProcess {

    //ts列表
    private List<String> tslist;

}
