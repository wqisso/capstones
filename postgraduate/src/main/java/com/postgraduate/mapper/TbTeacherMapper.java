package com.postgraduate.mapper;

import java.util.List;


import com.postgraduate.pojo.TbTeacher;

public interface TbTeacherMapper {
	//查询所有导师信息
	List<TbTeacher> selectAll();
	//通过工号查询单条记录
	TbTeacher selectOne(int id);
	//模糊查询
	List<TbTeacher> selectPart(TbTeacher tbTeacher);
	//增加
	int insert(TbTeacher tbTeacher);
	//修改信息
	int updatebyid(TbTeacher tbTeacher);
	//查询导师密码
	int updatePassById(TbTeacher tbTeacher);
}
