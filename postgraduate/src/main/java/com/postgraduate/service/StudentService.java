package com.postgraduate.service;

import java.util.List;


import com.postgraduate.pojo.TbStudent;

import entity.PageResult;

public interface StudentService {
	/**
	 * 查询全部学生
	 * @return
	 */
	public List<TbStudent> selectAll();
	/**
	 * 查询单个学生
	 * @return
	 */
	public TbStudent selectOne(int id);
	/**
	 * 模糊查询学生
	 * @return
	 */
	public List<TbStudent> selectPart(TbStudent tbStudent);
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 模糊查询返回分页列表
	 * @return
	 */
	public PageResult findPage(TbStudent tbStudent,int pageNum,int pageSize);
	/**
	 * 新增加学生
	 * @return
	 */
	public void insert(TbStudent tbStudent);
	/**
	 * 修改学生信息
	 * @return
	 */
	public void update(TbStudent tbStudent);
	/**
	 * 修改学生密码
	 * @return
	 */
	public void updatePassById(TbStudent tbStudent);
	

}
