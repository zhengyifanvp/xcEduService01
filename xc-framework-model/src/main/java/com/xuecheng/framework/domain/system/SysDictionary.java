package com.xuecheng.framework.domain.system;

import com.xuecheng.framework.domain.cms.CmsConfigModel;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
* @name: SysDictionary
*
* @description: 数据字典
*
* @author: Yifan Zheng
*
* @Date: 2020/2/12
*
* @Version：1.0
**/
@Data
@ToString
@Document(collection = "sys_dictionary")
public class SysDictionary {

    @Id
    private String id;

    @Field("d_name")
    private String dName;

    @Field("d_type")
    private String dType;

    @Field("d_value")
    private List<SysDictionaryValue> dValue;

}
