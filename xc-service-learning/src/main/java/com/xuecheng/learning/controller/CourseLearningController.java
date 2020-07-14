package com.xuecheng.learning.controller;

import com.xuecheng.api.learning.CourseLearningControllerApi;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.framework.domain.learning.XcLearningCourse;
import com.xuecheng.framework.domain.learning.XcLearningList;
import com.xuecheng.framework.domain.learning.respones.GetMediaResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.learning.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* @name: CourseLearningController
*
* @description: 课程学习的controller
*
* @author: Yifan Zheng
*
* @Date: 2020/3/15
*
* @Version：1.0
**/
@RestController
@RequestMapping("/learning/course")
public class CourseLearningController implements CourseLearningControllerApi {

    @Autowired
    LearningService learningService;

    @Override
    @GetMapping("/getmedia/{courseId}/{teachplanId}")
    public GetMediaResult getmedia(@PathVariable("courseId") String courseId,
                                   @PathVariable("teachplanId")String teachplanId) {

        return learningService.getmedia(courseId,teachplanId);
    }

    @Override
    @GetMapping ("/getusercourselist/{page}/{size}")
    public QueryResponseResult<XcLearningCourse> lists(@PathVariable("page") int page,
                                                       @PathVariable("size") int size,
                                                       CourseListRequest courseListRequest,
                                                       @RequestParam("userid") String uerid) {
        return learningService.getUserCourseList(page, size, courseListRequest, uerid);
    }

    @Override
    @PostMapping("/addopencourse/{courseId}/{userid}")
    public ResponseResult addOpenCourse(@PathVariable("courseId") String courseId,
                                        @PathVariable("userid") String userid) {
        return learningService.addOpenCourse(courseId,userid);
    }

}
