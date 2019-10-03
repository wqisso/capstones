package com.postgraduate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.postgraduate.pojo.TbStudent;

import com.postgraduate.service.StudentService;
import com.postgraduate.service.UsersService;

import entity.PageResult;
import entity.Result;


@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private UsersService usersService;
	
	/**
	 * 返回全部列表
	 * 
	 */
	@RequestMapping("/selectAll")
	public List<TbStudent> selectAll(){
		return studentService.selectAll();
	}
	/**
	 * 返回分页
	 * 
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows) {
		return studentService.findPage(page, rows);
	}
	/**
	 * 查询单个学生
	 * 
	 */
	@RequestMapping("/selectOne")
	public TbStudent fingOne(int id) {
		return studentService.selectOne(id);
	}
	
	/**
	 * 修改学生
	 * 
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbStudent tbStudent) {
		try {
			studentService.update(tbStudent);
			return new Result(true,"修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
	
	/**
	 * 修改学生密码
	 * 
	 */
	@RequestMapping("/updatePassById")
	public Result updatePassById(@RequestBody TbStudent tbStudent) {
		try {
			studentService.updatePassById(tbStudent);
			usersService.updateById(tbStudent.getTbUsers());
			return new Result(true,"修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
	
	/**
	 * 增加学生
	 * @return
	 */
	@RequestMapping("/insert")
	public Result insert(@RequestBody TbStudent tbStudent) {
		try {
			studentService.insert(tbStudent);
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
	}
	/**
	 * 模糊查询返回分页
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbStudent tbStudent,int page,int rows) {
		return studentService.findPage(tbStudent,page,rows);
	}
	
}
