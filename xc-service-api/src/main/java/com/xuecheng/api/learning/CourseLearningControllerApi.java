package com.xuecheng.api.learning;

import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.framework.domain.learning.XcLearningCourse;
import com.xuecheng.framework.domain.learning.XcLearningList;
import com.xuecheng.framework.domain.learning.respones.GetMediaResult;
import com.xuecheng.framework.domain.search.CourseSearchParam;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
* @name: CourseLearningControllerApi
*
* @description: 录播课程学习管理
*
* @author: Yifan Zheng
*
* @Date: 2020/3/15
*
* @Version：1.0
**/
@Api(value = "录播课程学习管理",description = "录播课程学习管理")
public interface CourseLearningControllerApi {

    @ApiOperation("获取课程学习地址")
    public GetMediaResult getmedia(String courseId, String teachplanId);

    @ApiOperation("查询个人添加的课程信息")
    public QueryResponseResult<XcLearningCourse> lists(int page, int size, CourseListRequest courseListRequest, String userid);

    @ApiOperation("个人用户添加课程")
    public ResponseResult addOpenCourse(String courseId, String userid);
}
