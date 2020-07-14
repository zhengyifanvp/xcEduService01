package com.xuecheng.learning.dao;

import com.github.pagehelper.Page;
import com.xuecheng.framework.domain.learning.XcLearningCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearningRepository extends JpaRepository<XcLearningCourse,String> {
    XcLearningCourse findXcLearningCourseByUserIdAndCourseId(String userId, String courseId);
    Page<XcLearningCourse> findXcLearningCourseByUserId(String userId);

}
