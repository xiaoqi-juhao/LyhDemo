package com.lyh.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	/**
	 * 返回指定模版
	 * @param page
	 * @return
	 */
	@PostMapping(value="/page")
	public String getPage(String page){
		return page;
	}
	/**
	 * 根模版初始化
	 * @return
	 */
	@RequestMapping("/")  
    public String index(){  
        return "index";  
    }  
}
