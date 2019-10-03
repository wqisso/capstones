package com.postgraduate.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.postgraduate.pojo.TbTrain;

public interface TbTrainMapper {
	//查询所有学生信息
	List<TbTrain> selectAll();
	//增加培养方案
	int insert(TbTrain tbTrain); 
	//查询一条记录
	TbTrain selectOne(int id);
	//更新审核
	int updateState(TbTrain tbTrain);
	//模糊查询
	List<TbTrain> selectPart(TbTrain tbTrain);
	//课程设置
	int insertLesTra(@Param("lesid")int lesid,@Param("traid")int traid);
}
