package com.postgraduate.service;

import java.util.List;

import com.postgraduate.pojo.TbTeacher;

import entity.PageResult;

public interface TeacherService {
	/**
	 * 查询全部导师
	 * @return
	 */
	public List<TbTeacher> selectAll();
	/**
	 * 查询单个导师
	 * @return
	 */
	public TbTeacher selectOne(int id);
	/**
	 * 模糊查询导师
	 * @return
	 */
	public List<TbTeacher> selectPart(TbTeacher tbTeacher);
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 模糊查询返回分页列表
	 * @return
	 */
	public PageResult findPage(TbTeacher tbTeacher,int pageNum,int pageSize);
	/**
	 * 新增加导师
	 * @return
	 */
	public void insert(TbTeacher tbTeacher);
	/**
	 * 修改导师信息
	 * @return
	 */
	public void update(TbTeacher tbTeacher);
	/**
	 * 修改导师密码
	 * @return
	 */
	public void updatePassById(TbTeacher tbTeacher);
}
