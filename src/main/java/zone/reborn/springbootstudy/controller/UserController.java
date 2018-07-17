package zone.reborn.springbootstudy.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import zone.reborn.springbootstudy.entity.User;

/**
 * @author 作者: reborn
 * @version 创建时间: 2018年7月15日 下午3:59:45
 * @description 类说明:
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/testUser", method = RequestMethod.GET)
	//@ResponseBody
	public Object getUser() {
		User user = new User();
		user.setName("reborn");
		user.setPassword("reborn");
		user.setAge(18);
		user.setBirthday(new Date());
		//user.setDesc("MVC模式的前端请求返回配置。");
		return user;
	}

}
