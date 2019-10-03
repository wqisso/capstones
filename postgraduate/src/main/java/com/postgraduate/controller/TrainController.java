package com.postgraduate.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgraduate.pojo.TbLesTra;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.pojo.TbTrain;
import com.postgraduate.service.TrainService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/Train")
public class TrainController {
	@Autowired
	private TrainService trainService;
	
	/**
	 * 增加培养方案
	 * @return
	 */
	@RequestMapping("/insert")
	public Result insert(@RequestBody TbTrain tbTrain) {
		try {
			trainService.insert(tbTrain);
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
	}
	/**
	 * 课程设置
	 * @return
	 */
	@RequestMapping("/insertLesTra")
	public Result insertLesTra(int[] lesid,int traid) {
		try {
			for(int les:lesid) {
				trainService.insertLesTra(les,traid);
			}
			return new Result(true,"增加成功");
		}catch(Exception e) {
			e.printStackTrace();
			return new Result(false,"增加失败");
		}
	}
	/**
	 * 查询所有培养方案
	 * @return
	 */
	@RequestMapping("selectAll")
	public List<TbTrain> selectAll(){
		return trainService.selectAll();
	}
	/**
	 * 查询单个培养方案
	 * 
	 */
	@RequestMapping("/selectOne")
	public TbTrain selectOne(int id) {
		return trainService.selectOne(id);
	}
	/**
	 * 返回分页
	 * 
	 */
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows) {
		return trainService.findPage(page, rows);
	}
	/**
	 * 审核培养方案
	 * 
	 */

	@RequestMapping("/updateState")
	public Result updateState(int id,int state) {
		try {
			TbTrain tbtrain = new TbTrain();
			tbtrain.setId(id);
			tbtrain.setState(state);
			trainService.updateState(tbtrain);
			return new Result(true,"修改成功");
		}catch(Exception e){
			e.printStackTrace();
			return new Result(false,"修改失败");
		}
	}
	/**
	 * 模糊查询返回分页
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbTrain tbTrain,int page,int rows) {
		return trainService.findPage(tbTrain,page,rows);
	}
}
