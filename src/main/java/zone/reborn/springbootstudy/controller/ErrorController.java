package zone.reborn.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年7月27日 下午1:53:41
 * @Description 类描述
 */
@Controller
@RequestMapping(value = "/error")
public class ErrorController {

	@RequestMapping(value = "/testError")
	public void testError() {
		int a = 9 / 0;
	}

}
