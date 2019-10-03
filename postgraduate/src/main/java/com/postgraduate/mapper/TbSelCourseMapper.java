package com.postgraduate.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import com.postgraduate.pojo.TbSelCourse;


public interface TbSelCourseMapper {
	//增加
	int insert(@Param("stuid")int stuid,@Param("lesteaid")int lesteaid);
	//减少选课人数
	int update(int id);
	//学生查看自己已选课程
	List<TbSelCourse> selectAll(@Param("uid")int uid);
	//删除自己已经选中的课程
	int delete(@Param("stuid")int stuid,@Param("lesteaid")int lesteaid);
	//管理员查看全部学生选课
	List<TbSelCourse> adminSelAll();
}
