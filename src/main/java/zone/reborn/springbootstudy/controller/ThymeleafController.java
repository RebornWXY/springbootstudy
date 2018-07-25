package zone.reborn.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年7月25日 下午2:54:50
 * @Description 类描述
 */
@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafController {

	@GetMapping(value = "/center")
	public String center() {
		return "/center/center";
	}

	@GetMapping(value = "/test")
	public String test() {
		return "/test";
	}

	@GetMapping(value = "/index")
	public String index(ModelMap mm) {
		mm.addAttribute("name", "reborn");
		return "/index";
	}

}
