package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
* @name: TeacherInfo
*
* @description:
*
* @author: Yifan Zheng
*
* @Date: 2020/2/9
*
* @Version：1.0
**/
@Data
@Entity
@ToString
@Table(name = "course_teacherinfo")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class CourseTeacherinfo implements Serializable {
    private static final long serialVersionUID = -91615110051689486L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;
    private String name;
    private String description;


}
