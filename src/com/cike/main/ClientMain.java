package com.cike.main;

import java.util.List;

import com.cike.cxf.ws.Cat;
import com.cike.cxf.ws.HelloWorld;
import com.cike.cxf.ws.User;
import com.cike.cxf.ws.impl.HelloWorldWs;

public class ClientMain {
	public static void main(String[] args) {
		HelloWorldWs factory = new HelloWorldWs();
		//此处返回的只是远程WebService的代理
		HelloWorld hw = factory.getHelloWorldWsPort();
		User user = new User();
		user.setId(30);
		user.setName("sun");
		user.setPass("3322");
		List<Cat> catList = hw.getCatsByUser(user);
		for (Cat cat : catList) {
			System.out.println(cat.getName());
		}
	}
}
