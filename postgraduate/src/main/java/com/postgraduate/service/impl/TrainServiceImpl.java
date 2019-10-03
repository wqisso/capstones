package com.postgraduate.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.postgraduate.mapper.TbTrainMapper;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.pojo.TbTrain;
import com.postgraduate.pojo.TbLesTra;
import com.postgraduate.service.TrainService;

import entity.PageResult;
@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TbTrainMapper tbTrainMapper;
	/**
	 * 增加培养方案
	 * @return
	 */
	@Override
	public void insert(TbTrain tbTrain) {
		tbTrainMapper.insert(tbTrain);
	}
	/**
	 * 课程设置
	 * @return
	 */
	@Override
	public void insertLesTra(int lesid,int traid) {
		tbTrainMapper.insertLesTra(lesid,traid);
	}
	/**
	 * 查询所有培养方案
	 * @return
	 */
	@Override
	public List<TbTrain> selectAll() {
		return tbTrainMapper.selectAll();
	}
	/**
	 * 查询单个培养方案
	 * @return
	 */
	@Override
	public TbTrain selectOne(int id) {
		return tbTrainMapper.selectOne(id);
	}
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbTrain> page = (Page<TbTrain>) tbTrainMapper.selectAll();
		return new PageResult(page.getTotal(),page.getResult());
	}

	/**
	 * 审核培养方案
	 * @return
	 */
	@Override
	public void updateState(TbTrain tbTrain) {
		tbTrainMapper.updateState(tbTrain);
	}
	/**
	 * 模糊查询
	 * @return
	 */
	@Override
	public PageResult findPage(TbTrain tbTrain, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		Page<TbTrain> page = (Page<TbTrain>)tbTrainMapper.selectPart(tbTrain);
		return new PageResult(page.getTotal(),page.getResult());
	}

}
