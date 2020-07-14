package com.xuecheng.manage_course.controller;

import com.xuecheng.api.course.CourseControllerApi;
import com.xuecheng.framework.domain.course.*;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.ext.CourseView;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.framework.domain.course.response.AddCourseResult;
import com.xuecheng.framework.domain.course.response.CoursePublishResult;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.manage_course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* @name: CourseController
*
* @description:
*
* @author: Yifan Zheng
*
* @Date: 2020/1/29
*
* @Version：1.0
**/
@RestController
@RequestMapping("/course")
public class CourseController implements CourseControllerApi {

    @Autowired
    CourseService courseService;


    //@PreAuthorize("hasAuthority('course_teachplan_list')")//当用户拥有course_teachplan_list权限时方可访问
    @Override
    @GetMapping("/teachplan/list/{courseId}")
    public TeachplanNode findTeachplanList(@PathVariable("courseId") String courseId) {
        /**
        * @methodName: findTeachplanList
        * @Description: 查询课程计划列表
        * @Param: [courseId]
        * @return: com.xuecheng.framework.domain.course.ext.TeachplanNode
        * @Author: Yifan Zheng
        * @Date: 2020/1/29
        */
        return courseService.findTeachplanList(courseId);
    }

    //@PreAuthorize("hasAuthority('course_teachplan_add')")
    @Override
    @PostMapping("/teachplan/add")
    public ResponseResult addTeachplan(@RequestBody  Teachplan teachplan) {
        /**
        * @methodName: addTeachplan
        * @Description: 课程计划添加
        * @Param: [teachplan]
        * @return: com.xuecheng.framework.model.response.ResponseResult
        * @Author: Yifan Zheng
        * @Date: 2020/2/8
        */

        return courseService.addTeachplan(teachplan);
    }

    @Override
    @GetMapping("/coursebase/list/{page}/{size}")
    public QueryResponseResult<CourseInfo> findCourseList(
            @PathVariable("page") int page,
            @PathVariable("size") int size,
            CourseListRequest courseListRequest) {
        /**
        * @methodName: findCourseList
        * @Description: 课程列表的展示
        * @Param: [page, size, courseListRequest]
        * @return: com.xuecheng.framework.model.response.QueryResponseResult<com.xuecheng.framework.domain.course.ext.CourseInfo>
        * @Author: Yifan Zheng
        * @Date: 2020/2/9
        */
        return courseService.findCourseList(page,size,courseListRequest);
    }

    @Override
    @PostMapping("/coursebase/add")
    public AddCourseResult addCourseBase(@RequestBody CourseBase courseBase) {
        return courseService.addCourseBase(courseBase);

    }

    @Override
    @GetMapping("/coursebase/get/{courseId}")
    public CourseBase getCourseBaseById(@PathVariable String courseId) throws RuntimeException {
        return courseService.getCoursebaseById(courseId);
    }

    @Override
    @PutMapping("/coursebase/update/{id}")
    public ResponseResult updateCourseBase(@PathVariable String id, @RequestBody CourseBase courseBase) {
        return courseService.updateCoursebase(id, courseBase);
    }


    @Override
    @GetMapping("/coursemarket/get/{courseId}")
    public CourseMarket getCourseMarketById(@PathVariable String courseId) {
        return courseService.getCourseMarketById(courseId);
    }

    @Override
    @PostMapping("/coursemarket/update/{id}")
    public ResponseResult updateCourseMarket(@PathVariable String id, @RequestBody CourseMarket courseMarket) {
        CourseMarket courseMarket_u = courseService.updateCourseMarket(id, courseMarket);
        if(courseMarket_u!=null){
            return new ResponseResult(CommonCode.SUCCESS);
        }else{
            return new ResponseResult(CommonCode.FAIL);
        }
    }

    @Override
    @GetMapping("/courseteacherinfo/get/{courseId}")
    public CourseTeacherinfo getCourseTeacherinfoById(@PathVariable String courseId) {
        return courseService.getCourseTeacherinfoById(courseId);
    }
    @Override
    @GetMapping("/courseteacherinfox/get/{courseId}")
    public ResponseResult addCourseTeacherinfo(@RequestBody CourseTeacherinfo courseTeacherinfo) {
        return courseService.addCourseTeacherinfo(courseTeacherinfo);
    }

    @Override
    @PostMapping("/courseteacherinfo/update/{id}")
    public ResponseResult updateCourseTeacherinfo(@PathVariable String id, @RequestBody CourseTeacherinfo courseTeacherinfo) {
        CourseTeacherinfo courseTeacherinfo1 = courseService.updateCourseTeacherinfo(id, courseTeacherinfo);
        if(courseTeacherinfo1!=null){
            return new ResponseResult(CommonCode.SUCCESS);
        }else {
            return new ResponseResult(CommonCode.FAIL);
        }

    }

    @Override
    @PostMapping("/coursepic/add")
    public ResponseResult addCoursePic(@RequestParam("courseId") String courseId,
                                       @RequestParam("pic") String pic) {
        //保存课程图片
        return courseService.saveCoursePic(courseId,pic);
    }

    //@PreAuthorize("hasAuthority('course_pic_list')")
    @Override
    @GetMapping("/coursepic/list/{courseId}")
    public CoursePic findCoursePic(@PathVariable String courseId) {
        return courseService.findCoursePic(courseId);
    }

    @Override
    @DeleteMapping("/coursepic/delete")
    public ResponseResult deleteCoursePic(@RequestParam("courseId") String courseId) {
        return courseService.deleteCoursePic(courseId);
    }

    @Override
    @GetMapping("/courseview/{id}")
    public CourseView courseview(@PathVariable("id") String id) {
        return courseService.getCoruseView(id);
    }

    @Override
    @PostMapping("/preview/{id}")
    public CoursePublishResult preview(@PathVariable("id") String id) {
        return courseService.preview(id);
    }

    @Override
    @PostMapping("/publish/{id}")
    public CoursePublishResult publish(@PathVariable String id) {
        return courseService.publish(id);
    }

    @Override
    @PostMapping("/savemedia")
    public ResponseResult savemedia(@RequestBody TeachplanMedia teachplanMedia) {
        return courseService.savemedia(teachplanMedia);
    }


}
