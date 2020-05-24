package com.withme.service;

import com.withme.vo.UserVO;
import com.withme.vo.LevelVO;

public interface UserService {

	public void register(UserVO userVO) throws Exception;
	
	public UserVO login(UserVO userVO) throws Exception;
	
	public void level(LevelVO levelVO) throws Exception;
}