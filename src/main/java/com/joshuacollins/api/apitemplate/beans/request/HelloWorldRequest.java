package com.joshuacollins.api.apitemplate.beans.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.joshuacollins.api.apitemplate.beans.HelloWorldData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloWorldRequest {

	@JsonProperty("Data")
	private HelloWorldData data;

	public HelloWorldData getData() {
		return data;
	}

	public void setData(HelloWorldData data) {
		this.data = data;
	}

}
