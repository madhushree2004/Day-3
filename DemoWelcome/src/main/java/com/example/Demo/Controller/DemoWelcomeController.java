package com.example.Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class DemoWelcomeController {
	@ResponseBody
	@RequestMapping(value="/method",method=RequestMethod.GET)
	public String welcome()
	{
		return "WELCOME";
	}
}