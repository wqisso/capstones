package com.postgraduate.service;

import java.util.List;

import com.postgraduate.pojo.TbLesTea;

import entity.PageResult;





public interface LesTeaService {
	public void insertLesTea(int lesid,int teaid);
	/**
	 * 查询全部课程
	 * @return
	 */
	public List<TbLesTea> selectAll();
	/**
	 * 学生查询开放课程
	 * @return
	 */
	public List<TbLesTea> stuSelectAll();
	/**
	 * 查询单个课程
	 * @return
	 */
	public TbLesTea selectOne(int id);
	/**
	 * 修改状态
	 * @return
	 */
	public void update(TbLesTea tbLesTea);
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 学生查询开放选课返回分页列表
	 * @return
	 */
	public PageResult stuFindPage(int pageNum,int pageSize);
}
