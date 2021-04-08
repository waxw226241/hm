package com.rw.hm.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResponse {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty(value = "bb")
    private String rsp;

	public String getRsp() {
		return rsp;
	}

	public void setRsp(String rsp) {
		this.rsp = rsp;
	}

}
