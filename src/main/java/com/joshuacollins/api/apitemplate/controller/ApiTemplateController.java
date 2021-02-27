package com.joshuacollins.api.apitemplate.controller;

import com.joshuacollins.api.apitemplate.beans.HelloWorldData;
import com.joshuacollins.api.apitemplate.beans.request.HelloWorldRequest;
import com.joshuacollins.api.apitemplate.beans.response.HelloWorldResponse;
import com.joshuacollins.api.apitemplate.beans.response.Links;
import com.joshuacollins.api.apitemplate.beans.response.Meta;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTemplateController {

	@PostMapping("/hello-world")
	public ResponseEntity<HelloWorldResponse> helloWorldController(@RequestBody HelloWorldRequest request,
			@RequestHeader HttpHeaders requestHeaders) {

		HelloWorldResponse response = new HelloWorldResponse();
		HelloWorldData responseData = new HelloWorldData();
		Links links = new Links();
		Meta meta = new Meta();

		responseData.setIdentification(request.getData().getIdentification());
		responseData.setName(request.getData().getName());
		links.setSelf("String");

		response.setData(responseData);
		response.setLinks(links);
		response.setMeta(meta);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@GetMapping("/hello/{name}")
	public ResponseEntity<HelloWorldResponse> helloNameController(@PathVariable("name") String name,
			@RequestParam(value = "id", required = true) String identification,
			@RequestHeader HttpHeaders requestHeaders) {

		HelloWorldResponse response = new HelloWorldResponse();
		HelloWorldData responseData = new HelloWorldData();
		Links links = new Links();
		Meta meta = new Meta();

		responseData.setIdentification(identification);
		responseData.setName(name);
		links.setSelf("String");

		response.setData(responseData);
		response.setLinks(links);
		response.setMeta(meta);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
