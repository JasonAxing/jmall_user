package com.jmall.server;

import javax.jws.WebService;

import com.jmall.bean.T_MALL_USER_ACCOUNT;

@WebService
public interface ServerInf {
	public String ping(String hello);
}
