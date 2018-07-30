package zone.reborn.springbootstudy.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import zone.reborn.springbootstudy.entity.User;

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

	// 测试thymeleaf的常用标签用法
	@GetMapping(value = "/test1")
	public String test1(ModelMap mm) {
		User user = new User();
		user.setName("reborn");
		user.setAge(18);
		user.setBirthday(new Date());
		user.setDesc("<font color='green'><b>hello</b></font>");
		mm.addAttribute("user", user);
		return "/test1";
	}

	@PostMapping(value = "/postform")
	public String postform(User u) {
		String name = u.getName();
		System.out.println(name);
		System.out.println(u.getAge());
		return "/test1";
	}
	
	@GetMapping(value = "/userList")
	public String userList(ModelMap mm) {
		User user = new User();
		user.setName("mannger");
		user.setAge(18);
		user.setBirthday(new Date());

		User user1 = new User();
		user1.setName("reborn1");
		user1.setAge(19);
		user1.setBirthday(new Date());

		User user2 = new User();
		user2.setName("reborn2");
		user2.setAge(20);
		user2.setBirthday(new Date());

		ArrayList<User> userList = new ArrayList<>();
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		mm.addAttribute("userList", userList);
		mm.addAttribute("user", user);

		return "/test1";
	}
}
