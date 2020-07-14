package com.xuecheng.framework.domain.media.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;
/**
* @name: QueryMediaFileRequest
*
* @description: 关于media文件处理后返回的消息
*
* @author: Yifan Zheng
*
* @Date: 2020/3/10
*
* @Version：1.0
**/
@Data
public class QueryMediaFileRequest extends RequestData {

    private String fileOriginalName;
    private String processStatus;
    private String tag;
}
