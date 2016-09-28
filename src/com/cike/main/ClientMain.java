package com.cike.main;

import com.cike.cxf.ws.HelloWorld;
import com.cike.cxf.ws.impl.HelloWorldWs;

public class ClientMain {
	public static void main(String[] args) {
		HelloWorldWs factory = new HelloWorldWs();
		//此处返回的只是远程WebService的代理
		HelloWorld hw = factory.getHelloWorldWsPort();
		System.out.println(hw.sayHi("孙悟空"));
	}
}
