package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
* @name: TeachplanMediaPub
*
* @description: 前端搜到的课程计划的媒资信息 根据目录播放视频
*
* @author: Yifan Zheng
*
* @Date: 2020/3/14
*
* @Version：1.0
**/
@Data
@ToString
@Entity
@Table(name="teachplan_media_pub")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TeachplanMediaPub implements Serializable {
    private static final long serialVersionUID = -916357110051689485L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(name="teachplan_id")
    private String teachplanId;

    @Column(name="media_id")
    private String mediaId;

    @Column(name="media_fileoriginalname")
    private String mediaFileOriginalName;

    @Column(name="media_url")
    private String mediaUrl;

    @Column(name="courseid")
    private String courseId;

    @Column(name="timestamp")
    private Date timestamp;//时间戳

}
