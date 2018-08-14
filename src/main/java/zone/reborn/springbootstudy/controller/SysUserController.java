package zone.reborn.springbootstudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zone.reborn.springbootstudy.pojo.SysUser;
import zone.reborn.springbootstudy.service.SysUserService;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年8月10日 下午2:58:54
 * @Description 类描述
 */
@RestController
@RequestMapping(value = "/sysuser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@PostMapping(value = "/insert")
	public int insert(SysUser sysUser) {
		return sysUserService.insert(sysUser);
	}

	@PutMapping(value = "/update")
	public int updateByPrimaryKey(SysUser sysUser) {
		return sysUserService.updateByPrimaryKey(sysUser);
	}

	@DeleteMapping(value = "/delete")
	public int deleteByPrimaryKey(int id) {
		return sysUserService.deleteByPrimaryKey(id);
	}

	@GetMapping(value = "/selectOne")
	public SysUser selectByPrimaryKey(int id) {
		return sysUserService.selectByPrimaryKey(id);
	}

	@GetMapping(value = "/selectAll")
	public List<SysUser> selectAll() {
		return sysUserService.selectAll();
	}

	@GetMapping(value = "/selectPaged")
	public List<SysUser> selectPaged(Integer page) {
		if (page == null) {
			page = 1;
		}
		int pageSize = 5;
		SysUser sysUser = new SysUser();
		sysUser.setName("新");

		return sysUserService.selecPaged(sysUser, page, pageSize);
	}

}
