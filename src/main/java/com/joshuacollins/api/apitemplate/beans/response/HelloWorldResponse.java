package com.joshuacollins.api.apitemplate.beans.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.joshuacollins.api.apitemplate.beans.HelloWorldData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloWorldResponse {

	@JsonProperty("Data")
	private HelloWorldData data;

	@JsonProperty("Links")
	private Links links;

	@JsonProperty("Meta")
	private Meta meta;

	public HelloWorldData getData() {
		return data;
	}

	public void setData(HelloWorldData data) {
		this.data = data;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}
}
