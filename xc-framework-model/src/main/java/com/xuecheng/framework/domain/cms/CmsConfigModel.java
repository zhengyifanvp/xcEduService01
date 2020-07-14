package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
* @name: CmsConfigModel
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
public class CmsConfigModel {
    private String key;
    private String name;
    private String url;
    private Map mapValue;
    private String value;

}
