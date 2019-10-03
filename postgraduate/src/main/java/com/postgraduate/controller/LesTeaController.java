package com.postgraduate.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgraduate.pojo.TbLesTea;

import com.postgraduate.service.LesTeaService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/LesTea")
public class LesTeaController {
	@Autowired
	private LesTeaService lesTeaService;
	/**
	 * 课程设置任课老师
	 * @return
	 */
	@RequestMapping("/insertLesTea")
	public Result insertLesTea(int lesid,int[] teaid) {
		try {
			for(int tea:teaid) {
				lesTeaService.insertLesTea(lesid,tea);
			}
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
	}
	/**
	 * 返回全部列表
	 * 
	 */
	@RequestMapping("/selectAll")
	public List<TbLesTea> selectAll(){
		return lesTeaService.selectAll();
	}
	/**
	 * 学生查询开放选课
	 * 
	 */
	@RequestMapping("/stuSelectAll")
	public List<TbLesTea> stuSelectAll(){
		return lesTeaService.stuSelectAll();
	}
	/**
	 * 查询单个
	 * @param id
	 * @return
	 */
	/**
	 * 返回全部分页列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows) {
		return lesTeaService.findPage(page, rows);
	}
	/**
	 * 学生查询开放选课返回全部分页列表
	 * @return
	 */
	@RequestMapping("/stuFindPage")
	public PageResult stuFindPagefindPage(int page,int rows) {
		return lesTeaService.stuFindPage(page, rows);
	}
	@RequestMapping("/selectOne")
	public TbLesTea findOne(int id) {
		return lesTeaService.selectOne(id);
	}
	/**
	 * 修改
	 * @param brand
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbLesTea tbLesTea) {
		try {
			lesTeaService.update(tbLesTea);
			return new Result(true,"修改成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
}
