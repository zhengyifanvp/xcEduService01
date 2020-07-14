package com.xuecheng.api.course;

import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.framework.domain.course.*;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.ext.CourseView;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.framework.domain.course.response.AddCourseResult;
import com.xuecheng.framework.domain.course.response.CoursePublishResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;

/**
* @name: CourseControllerApi
*
* @description: 课程管理的相关结构 提供课程的增、删、改、查
*
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/

@Api(value="课程管理接口",description = "课程管理接口，提供课程的增、删、改、查")
public interface CourseControllerApi {
    @ApiOperation("课程计划查询")
    public TeachplanNode findTeachplanList(String couresId);

    @ApiOperation("添加课程计划")
    public ResponseResult addTeachplan(Teachplan teachplan);

    @ApiOperation("查询我的课程列表")
    public QueryResponseResult<CourseInfo> findCourseList(
            int page,
            int size,
            CourseListRequest courseListRequest
    );

    @ApiOperation("添加课程基础信息")
    public AddCourseResult addCourseBase(CourseBase courseBase);

    @ApiOperation("获取课程基础信息")
    public CourseBase getCourseBaseById(String courseId) throws RuntimeException;

    @ApiOperation("更新课程基础信息")
    public ResponseResult updateCourseBase(String id, CourseBase courseBase);

    @ApiOperation("获取课程营销信息")
    public CourseMarket getCourseMarketById(String courseId);

    @ApiOperation("更新/添加 课程营销信息")
    public ResponseResult updateCourseMarket(String id,CourseMarket courseMarket);

    @ApiOperation("获取课程教师信息")
    public CourseTeacherinfo getCourseTeacherinfoById(String courseId);

    @ApiOperation("更新 课程教师信息")
    public ResponseResult updateCourseTeacherinfo(String id,CourseTeacherinfo courseTeacherinfo);

    @ApiOperation("添加课程教师信息")
    public ResponseResult addCourseTeacherinfo(CourseTeacherinfo courseTeacherinfo);

    @ApiOperation("添加课程图片")
    public ResponseResult addCoursePic(String courseId,String pic);

    @ApiOperation("获取课程基础信息")
    public CoursePic findCoursePic(String courseId);

    @ApiOperation("删除课程图片")
    public ResponseResult deleteCoursePic(String courseId);

    @ApiOperation("课程视图查询")
    public CourseView courseview(String id);

    @ApiOperation("预览课程")
    public CoursePublishResult preview(String id);

    @ApiOperation("发布课程")
    public CoursePublishResult publish(@PathVariable String id);

    @ApiOperation("保存课程计划与媒资文件关联")
    /**
    * @methodName: savemedia
    * @Description: 保存媒体信息与课程信息的关联
    * @Param: [teachplanMedia]
    * @return: com.xuecheng.framework.model.response.ResponseResult
    * @Author: Yifan Zheng
    * @Date: 2020/3/12
    */
    public ResponseResult savemedia(TeachplanMedia teachplanMedia);
}

