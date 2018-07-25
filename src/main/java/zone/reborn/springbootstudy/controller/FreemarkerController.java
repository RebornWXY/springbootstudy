package zone.reborn.springbootstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import zone.reborn.springbootstudy.configuration.Resource;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年7月25日 下午2:01:05
 * @Description 类描述
 */
@Controller
@RequestMapping(value="/freemarker")
public class FreemarkerController {
	
	@Autowired
	private Resource resource;
	
	@GetMapping(value="/index")
	public String index(ModelMap mm) {
		mm.addAttribute("resource", resource);
		return "/freemarker/index";
	}
	
	@GetMapping(value="/center")
	public String center(ModelMap mm) {
		return "/freemarker/center/center";
	}
	
}
