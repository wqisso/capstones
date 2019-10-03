package com.postgraduate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.postgraduate.pojo.TbSelCourse;
import com.postgraduate.service.SelCourseService;

import entity.Result;

@RestController
@RequestMapping("/SelCourse")
public class SelCourseController {
	@Autowired
	private SelCourseService selCourseService;
	/**
	 * 返回全部列表
	 * 
	 */
	@RequestMapping("/selectAll")
	public List<TbSelCourse> selectAll(int id){
		return selCourseService.selectAll(id);
	}
	/**
	 * 管理员查询全部选课情况
	 * 
	 */
	@RequestMapping("/adminSelAll")
	public List<TbSelCourse> adminSelAll(){
		return selCourseService.adminSelAll();
	}
	/**
	 * 增加学生
	 * @return
	 */
	@RequestMapping("/insert")
	public Result insert(int uid ,int sid) {
		try {
			selCourseService.insert(uid,sid);
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
	}
	/**
	 * 删除已选课程
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(int stuid ,int lesteaid) {
		try {
			selCourseService.delete(stuid,lesteaid);
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
	}
}
