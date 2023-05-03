package com.dans.controller;

import com.dans.component.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class RouteController {

	@Autowired
	Api api;

	//2. Get job list API
	@GetMapping("/job-list")
	public String getJobListDetail(){
		String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
		return api.getJobsDataAsString(url);
	}

	//3. Get job detail API
	@GetMapping("/job-list/{id}")
	public String getJobListDetail(@PathVariable("id") String id){
		String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions/";
		return api.getJobsDataAsString(url + id);
	}

}