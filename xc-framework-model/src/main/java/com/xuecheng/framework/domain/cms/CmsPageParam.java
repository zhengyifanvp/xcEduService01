package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;

/**
* @name: CmsPageParam
*
* @description:
*
* @author: Yifan Zheng
*
* @Date: 2020/1/9
*
* @Version：1.0
**/
@Data
@ToString
public class CmsPageParam {
   //参数名称
    private String pageParamName;
    //参数值
    private String pageParamValue;

}
