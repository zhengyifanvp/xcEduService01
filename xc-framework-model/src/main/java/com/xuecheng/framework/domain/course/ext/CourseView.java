package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.CourseMarket;
import com.xuecheng.framework.domain.course.CoursePic;
import com.xuecheng.framework.domain.course.CourseTeacherinfo;
import com.xuecheng.framework.domain.ucenter.XcTeacher;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* @name: CourseView
*
* @description: 课程页面信息视图的模型(课程页面预览的模型数据)
*
* @author: Yifan Zheng
*
* @Date: 2020/2/22
*
* @Version：1.0
**/
@Data
@NoArgsConstructor
@ToString
public class CourseView implements java.io.Serializable {
    private CourseBase courseBase;
    private CoursePic coursePic;
    private CourseMarket courseMarket;
    private TeachplanNode teachplanNode;
    //简单的扩展教师的信息
    private CourseTeacherinfo courseTeacherinfo;
}
