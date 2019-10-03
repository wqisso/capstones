package com.postgraduate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.postgraduate.pojo.TbTeacher;
import com.postgraduate.service.TeacherService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {
	@Autowired
	private TeacherService teacherService; 
	
	/**
	 * 返回全部列表
	 * 
	 */
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<TbTeacher> selectAll(){
		return teacherService.selectAll();
	}
	/**
	 * 返回分页
	 * 
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows) {
		return teacherService.findPage(page, rows);
	}
	/**
	 * 查询单个导师
	 * 
	 */
	@RequestMapping("/selectOne")
	public TbTeacher fingOne(int id) {
		return teacherService.selectOne(id);
	}
	
	/**
	 * 修改导师
	 * 
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbTeacher tbTeacher) {
		try {
			teacherService.update(tbTeacher);
			return new Result(true,"修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
	
	/**
	 * 修改导师密码
	 * 
	 */
	@RequestMapping("/updatePassById")
	public Result updatePassById(@RequestBody TbTeacher tbTeacher) {
		try {
			teacherService.updatePassById(tbTeacher);
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
	public Result insert(@RequestBody TbTeacher tbTeacher) {
		try {
			teacherService.insert(tbTeacher);
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
	public PageResult search(@RequestBody TbTeacher tbTeacher,int page,int rows) {
		return teacherService.findPage(tbTeacher,page,rows);
	}
}
