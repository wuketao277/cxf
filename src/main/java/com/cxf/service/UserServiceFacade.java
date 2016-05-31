package com.cxf.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.cxf.entity.User;

@WebService
public interface UserServiceFacade {
	public User getUserByName(@WebParam(name = "name") String name);

	public void setUser(User user);

}
