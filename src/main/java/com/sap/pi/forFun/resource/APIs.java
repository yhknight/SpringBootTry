package com.sap.pi.forFun.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.pi.forFun.model.UserInfo;
import com.sap.pi.forFun.service.UserinfoService;

@RestController
@RequestMapping(path = "api/v1/")
public class APIs {

	@Autowired
	Environment env;

	@Autowired
	UserinfoService userInfoServ;

	@GetMapping(path = "helloWorld/{zone}")
	public List<UserInfo> getCouuntries(@PathVariable String zone) {

		return userInfoServ.getSaveAndgetAllUsers();
		// return Arrays.asList("China", "Japan",
		// env.getProperty("world.countries"));
	}

}
