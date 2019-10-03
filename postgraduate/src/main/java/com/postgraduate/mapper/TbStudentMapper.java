package com.postgraduate.mapper;

import java.util.List;


import com.postgraduate.pojo.TbStudent;

public interface TbStudentMapper {
	//查询所有学生信息
	List<TbStudent> selectAll();
	//通过学号查询单条记录
	TbStudent selectOne(int id);
	//模糊查询
	List<TbStudent> selectPart(TbStudent tbStudent);
	//增加
	int insert(TbStudent tbStudent);
	//修改信息（不包括导师编号）
	int updatebyid(TbStudent tbStudent);
	//查询学生密码
	int updatePassById(TbStudent tbStudent);
	
}
