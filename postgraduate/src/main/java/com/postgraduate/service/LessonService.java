package com.postgraduate.service;

import java.util.List;

import com.postgraduate.pojo.TbLesson;

import entity.PageResult;

public interface LessonService {
	/**
	 * 查询全部课程
	 * @return
	 */
	public List<TbLesson> selectAll();
	/**
	 * 查询单个课程
	 * @return
	 */
	public TbLesson selectOne(int id);
	/**
	 * 模糊查询课程
	 * @return
	 */
	public List<TbLesson> selectPart(TbLesson plesson);
	/**
	 * 删除课程
	 * @return
	 */
	public void delete(int[] ids);
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 模糊查询返回分页列表
	 * @return
	 */
	public PageResult findPage(TbLesson plesson,int pageNum,int pageSize);
	/**
	 * 增加课程
	 * @return
	 */
	public void insert(TbLesson plesson);
	/**
	 * 修改课程
	 * @return
	 */
	public void update(TbLesson plesson);
}
