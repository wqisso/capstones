package com.postgraduate.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.postgraduate.pojo.TbLesTea;


public interface TbLesTeaMapper {
	//课程设置任课老师
	int insertLesTea(@Param("lesid")int lesid,@Param("teaid")int teaid);
	//查询全部已任命老师的课程
	List<TbLesTea> selectAll();
	//
	TbLesTea selectOne(int id);
	//改
	int updatebyid(TbLesTea tbLesTea);
	//学生查询开放选课的课程
	List<TbLesTea> stuSelAll();
}
