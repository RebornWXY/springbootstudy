package zone.reborn.springbootstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import zone.reborn.springbootstudy.pojo.SysUser;
import zone.reborn.springbootstudy.utils.JsonMapper;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年8月16日 下午1:12:14
 * @Description 类描述
 */
@RestController
@RequestMapping(value = "/redis")
public class RedisController {
	@Autowired
	private  StringRedisTemplate stringRedisTemplate;
	
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
		
		// stringRedisTemplate.opsForValue().set("reborn:user", userJson);
		return stringRedisTemplate.opsForValue().get("reborn:user");
	}
}
