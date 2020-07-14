package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.Teachplan;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @name: TeachplanNode
*
* @description: 树形结构的模型类
*
* @author: Yifan Zheng
*
* @Date: 2020/2/5
*
* @Version：1.0
**/
@Data
@ToString
public class TeachplanNode extends Teachplan {

    List<TeachplanNode> children;

    //媒资文件id
    String mediaId;
    //媒资文件原始名称
    String mediaFileoriginalname;

}
