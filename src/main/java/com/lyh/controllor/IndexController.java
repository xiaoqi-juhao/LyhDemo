package com.lyh.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@PostMapping(value="/page")
	public String getPage(String page){
		return page;
	}
	@RequestMapping("/")  
    public String index(){  
        return "index";  
    }  
}
