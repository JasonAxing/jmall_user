package com.jmall.server;

public class ServerImp implements ServerInf {

	@Override
	public String ping(String hello) {
		System.out.println("cxf接口调用：" + hello);
		return "pong";
	}
	
}
