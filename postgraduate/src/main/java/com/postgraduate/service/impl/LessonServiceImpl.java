package com.postgraduate.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.postgraduate.mapper.TbLessonMapper;
import com.postgraduate.pojo.TbLesson;
import com.postgraduate.service.LessonService;

import entity.PageResult;

@Service
public class LessonServiceImpl implements LessonService{
	@Autowired
	private TbLessonMapper plessonMapper;

	public List<TbLesson> selectAll(){
		return plessonMapper.selectAll();
	}

	@Override
	public void delete(int[] ids) {
		for(int id:ids) {
			plessonMapper.delete(id);
		}	
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbLesson> page = (Page<TbLesson>) plessonMapper.selectAll();
		return new PageResult(page.getTotal(),page.getResult());
	}
	/**
	 * 增加课程
	 * @return
	 */
	@Override
	public void insert(TbLesson plesson) {
		plessonMapper.insert(plesson);
	}
	/**
	 * 修改课程
	 * @return
	 */
	@Override
	public void update(TbLesson plesson) {
		plessonMapper.updatebyid(plesson);
		
	}
	/**
	 * 查询单个课程
	 * @return
	 */
	@Override
	public TbLesson selectOne(int id) {
		// TODO Auto-generated method stub
		return plessonMapper.selectOne(id);
	}
	/**
	 * 模糊查询课程
	 * @return
	 */
	@Override
	public List<TbLesson> selectPart(TbLesson plesson) {
		// TODO Auto-generated method stub
		return plessonMapper.selectPart(plesson);
	}
	/**
	 * 模糊查询课程分页
	 * @return
	 */
	@Override
	public PageResult findPage(TbLesson plesson, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		Page<TbLesson> page = (Page<TbLesson>)plessonMapper.selectPart(plesson);
		return new PageResult(page.getTotal(),page.getResult());
	}
}
