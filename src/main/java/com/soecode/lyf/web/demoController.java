package com.soecode.lyf.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/demo") // url:/模块/资源/{id}/细分 /seckill/list
public class demoController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	private String sout(ModelMap model) {
		System.out.println("helloee789797987");
		// list.jsp + model = ModelAndView
		model.addAttribute("msg", "我是黎合明");
		model.put("name","liheming");
//		return "list";// WEB-INF/jsp/"list".jsp
		return "sout";
	}




}
