package com.xuecheng.learning.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuecheng.framework.domain.course.TeachplanMediaPub;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.framework.domain.learning.XcLearningCourse;
import com.xuecheng.framework.domain.learning.XcLearningList;
import com.xuecheng.framework.domain.learning.respones.GetMediaResult;
import com.xuecheng.framework.domain.learning.respones.LearningCode;
import com.xuecheng.framework.exception.ExceptionCast;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.learning.client.CourseSearchClient;
import com.xuecheng.learning.dao.LearningRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
* @name: LearningService
*
* @description: 学习中心的service
*
* @author: Yifan Zheng
*
* @Date: 2020/3/15
*
* @Version：1.0
**/
@Service
public class LearningService {

    @Autowired
    CourseSearchClient courseSearchClient;

    @Autowired
    LearningRepository learningRepository;

    //获取课程学习地址（视频播放地址）
    public GetMediaResult getmedia(String courseId, String teachplanId) {
        //校验学生的学生权限...

        //远程调用搜索服务查询课程计划所对应的课程媒资信息
        TeachplanMediaPub teachplanMediaPub = courseSearchClient.getmedia(teachplanId);
        if(teachplanMediaPub == null || StringUtils.isEmpty(teachplanMediaPub.getMediaUrl())){
            //获取学习地址错误
            ExceptionCast.cast(LearningCode.LEARNING_GETMEDIA_ERROR);
        }
        return new GetMediaResult(CommonCode.SUCCESS,teachplanMediaPub.getMediaUrl());
    }

    public QueryResponseResult<XcLearningCourse> getUserCourseList(int page, int size, CourseListRequest courseListRequest, String uerid) {
        if(courseListRequest == null){
            courseListRequest = new CourseListRequest();
        }
        if(page<=0){
            page = 0;
        }
        if(size<=0){
            size = 20;
        }
        //设置分页参数
        PageHelper.startPage(page, size);
        //分页查询
        Page<XcLearningCourse> PageList = learningRepository.findXcLearningCourseByUserId(uerid);
        //查询列表
        List<XcLearningCourse> result = PageList.getResult();
        //总记录数
        long total = PageList.getTotal();
        //查询结果集
        QueryResult<XcLearningCourse> LearningCourseQueryResult = new QueryResult<>();
        LearningCourseQueryResult.setList(result);
        LearningCourseQueryResult.setTotal(total);
        return new QueryResponseResult<XcLearningCourse>(CommonCode.SUCCESS, LearningCourseQueryResult);
    }

    @Transactional
    public ResponseResult addOpenCourse(String courseId, String userid) {
        XcLearningCourse result = learningRepository.findXcLearningCourseByUserIdAndCourseId(userid, courseId);
        if(result != null){
            ExceptionCast.cast(LearningCode.LEARNING_GETLEARNINGCOURSE_ERROR);
        }
        XcLearningCourse learningCourse = new XcLearningCourse();
        learningCourse.setStatus("501001");
        learningCourse.setCourseId(courseId);
        learningCourse.setUserId(userid);
        learningCourse.setStartTime(new Date());
        learningRepository.save(learningCourse);
        return new ResponseResult(CommonCode.SUCCESS);
    }
}
