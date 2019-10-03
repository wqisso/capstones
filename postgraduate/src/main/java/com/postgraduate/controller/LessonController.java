package com.postgraduate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.postgraduate.pojo.TbLesson;
import com.postgraduate.service.LessonService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/Plesson")
public class LessonController {
	@Autowired
	private LessonService plessonService;
	
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<TbLesson> selectAll(){
		return plessonService.selectAll();
	}
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows) {
		return plessonService.findPage(page, rows);
	}
	/**
	 * 增加课程
	 * @return
	 */
	@RequestMapping("/insert")
	public Result insert(@RequestBody TbLesson plesson) {
		try {
			plessonService.insert(plesson);
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
	}
	/**
	 * 修改
	 * @param brand
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbLesson plesson) {
		try {
			plessonService.update(plesson);
			return new Result(true,"修改成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
	/**
	 * 查询单个课程实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectOne")
	public TbLesson findOne(int id) {
		return plessonService.selectOne(id);
	}
	/**
	 * 模糊查询课程实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectPart")
	@ResponseBody
	public List<TbLesson> findPart(TbLesson plesson) {
		return plessonService.selectPart(plesson);
	}
	@RequestMapping("/delete")
	public Result delete(int[] ids) {
		try {
			plessonService.delete(ids);
			return new Result(true,"删除成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"删除失败");
		}
	}
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbLesson plesson,int page,int rows) {
		return plessonService.findPage(plesson,page,rows);
	}
}
