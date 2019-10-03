package com.postgraduate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgraduate.mapper.TbUsersMapper;
import com.postgraduate.pojo.TbUsers;
import com.postgraduate.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private TbUsersMapper tbusersMapper;
	
	@Override
	public void updateById(TbUsers tbUsers) {
		// TODO Auto-generated method stub
		tbusersMapper.updateById(tbUsers);
	}

}
