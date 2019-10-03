package com.postgraduate.service;

import com.postgraduate.pojo.TbUsers;

public interface UsersService {
	//	修改密码
	/**
	 * 修改学生密码
	 * @return
	 */
	public void updateById(TbUsers tbUsers);
}
