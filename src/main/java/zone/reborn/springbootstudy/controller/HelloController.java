package zone.reborn.springbootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者: reborn
 * @version 创建时间: 2018年7月15日 下午3:59:45
 * @description 类说明:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(value="/testHello",method=RequestMethod.GET)
	public Object getHello() {
		return "Hello SpringBoot!";
	}
	
}
