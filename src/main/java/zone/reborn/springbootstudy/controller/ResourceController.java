package zone.reborn.springbootstudy.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zone.reborn.springbootstudy.configuration.Resource;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年7月25日 上午11:25:21
 * @Description 类描述
 */
@RestController
@RequestMapping(value = "/resource")
public class ResourceController {

	@Autowired
	private Resource resource;

	@GetMapping(value="/testResource")
	public Resource getResource() {
		
		Resource newResource = new Resource();
		BeanUtils.copyProperties(resource, newResource);
		return newResource;
		
	}

}
