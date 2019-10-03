package com.postgraduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.postgraduate.mapper.TbTeacherMapper;
import com.postgraduate.pojo.TbTeacher;
import com.postgraduate.service.TeacherService;

import entity.PageResult;

@Service
public class TeacherServiceImpl implements TeacherService {
    
	@Autowired
	private TbTeacherMapper tbTeacherMapper; 
	
	@Override
	public List<TbTeacher> selectAll() {
		
		return tbTeacherMapper.selectAll();
	}
	/**
	 * 查询单个导师
	 * @return
	 */
	@Override
	public TbTeacher selectOne(int id) {
		return tbTeacherMapper.selectOne(id);
	}
	/**
	 * 模糊查询
	 * @return
	 */
	@Override
	public List<TbTeacher> selectPart(TbTeacher tbTeacher) {
		
		return null;
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbTeacher> page = (Page<TbTeacher>) tbTeacherMapper.selectAll();
		return new PageResult(page.getTotal(),page.getResult());
	}
	/**
	 * 增加导师
	 * @return
	 */
	@Override
	public void insert(TbTeacher tbTeacher) {
		tbTeacherMapper.insert(tbTeacher);
	}
	/**
	 * 修改导师
	 * @return
	 */
	@Override
	public void update(TbTeacher tbTeacher) {
		tbTeacherMapper.updatebyid(tbTeacher);
		
	}
	/**
	 * 修改学生密码
	 * @return
	 */
	@Override
	public void updatePassById(TbTeacher tbTeacher) {
		tbTeacherMapper.updatePassById(tbTeacher);
		
	}
	
	/**
	 * 模糊查询导师分页
	 * @return
	 */
	@Override
	public PageResult findPage(TbTeacher tbTeacher, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		Page<TbTeacher> page = (Page<TbTeacher>)tbTeacherMapper.selectPart(tbTeacher);
		return new PageResult(page.getTotal(),page.getResult());
	}

}
