package com.postgraduate.mapper;

import java.util.List;



import com.postgraduate.pojo.TbLesson;

public interface TbLessonMapper {
	//查询全部
	List<TbLesson> selectAll();
	//查询单条记录
	TbLesson selectOne(int id);
	//模糊查询
	List<TbLesson> selectPart(TbLesson plesson);
	//删除
	int delete(int id);
	//增
	int insert(TbLesson plesson);
	//改
	int updatebyid(TbLesson plesson);
	
}
