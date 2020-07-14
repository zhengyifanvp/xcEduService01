package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
* @name: QueryPageRequest
*
* @description: 接受页面查询的查询条件
*
* @author: Yifan Zheng
*
* @Date: 2020/1/10
*
* @Version：1.0
**/
@Data
public class QueryPageRequest extends RequestData {
    //站点Id
    private String siteId;
    //页面Id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板id
    private String templateId;
}
