package zone.reborn.springbootstudy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import zone.reborn.springbootstudy.pojo.SysUser;
import zone.reborn.springbootstudy.utils.JsonMapper;
import zone.reborn.springbootstudy.utils.RedisOperator;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年8月16日 下午1:12:14
 * @Description 类描述
 */
@RestController
@RequestMapping(value = "/redis")
@SuppressWarnings(value = "all")
public class RedisController {
	@Autowired
	private  StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private RedisOperator redisOperator;
	
	@RequestMapping(value = "/test")
	public String redisTest() {
		stringRedisTemplate.opsForValue().set("reborn", "reborn-redis");
		return stringRedisTemplate.opsForValue().get("reborn");
	}
	
	@RequestMapping(value = "/test2")
	public String redisTest2() {
		SysUser user = new SysUser();
		user.setAge(15);
		user.setName("reborn");
		user.setId(666);
		
		String userJson = JsonMapper.objectToJson(user);
		
		stringRedisTemplate.opsForValue().set("reborn:user", userJson);
		return stringRedisTemplate.opsForValue().get("reborn:user");
	}
	
	@RequestMapping(value = "/test3")
	public List<SysUser> redisTest3() {
		ArrayList<SysUser> userList = new ArrayList<>();
		
		SysUser user0 = new SysUser();
		user0.setAge(0);
		user0.setName("reborn0");
		user0.setId(0);
		
		SysUser user1 = new SysUser();
		user1.setAge(1);
		user1.setName("reborn1");
		user1.setId(1);
		
		SysUser user2 = new SysUser();
		user2.setAge(2);
		user2.setName("reborn2");
		user2.setId(2);
		
		userList.add(user0);
		userList.add(user1);
		userList.add(user2);
		
		String userListJson = JsonMapper.objectToJson(userList);
		redisOperator.set("userList", userListJson);
		
		ArrayList<SysUser> userList2 = JsonMapper.jsonToObject(redisOperator.get("userList"), userList.getClass());
		System.out.println(userList2);
		return userList2;
	}
	
}
