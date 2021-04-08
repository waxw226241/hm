package com.rw.hm.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rw.hm.request.TestRequest;
import com.rw.hm.response.TestResponse;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "test")
public class TestController {
	private static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value = "test1")
	public TestResponse test1(@RequestBody TestRequest req) {
		logger.info("ddddd"+req.getName());
		
		TestResponse rsp = new TestResponse();
		rsp.setRsp(req.getName()+"dsadada");
		return rsp;
	}
}
