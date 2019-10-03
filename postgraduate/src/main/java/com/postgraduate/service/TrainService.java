package com.postgraduate.service;


import java.util.List;


import com.postgraduate.pojo.TbTrain;
import com.postgraduate.pojo.TbLesTra;
import entity.PageResult;

public interface TrainService {
	/**
	 * 新增加培养方案
	 * @return
	 */
	public void insert(TbTrain tbTrain);
	/**
	 * 新增加培养方案课程
	 * @return
	 */
	public void insertLesTra(int lesid,int traid);
	/**
	 * 查询所有培养方案
	 * @return
	 */
	public List<TbTrain> selectAll();
	/**
	 * 查询单个培养方案
	 * @return
	 */
	public TbTrain selectOne(int id);

	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 模糊查询返回分页列表
	 * @return
	 */
	public PageResult findPage(TbTrain tbTrain,int pageNum,int pageSize);
	/**
	 * 培养方案审核
	 * @return
	 */
	public void updateState(TbTrain tbTrain);
}
