package zone.reborn.springbootstudy.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
import zone.reborn.springbootstudy.mapper.SysUserMapper;
import zone.reborn.springbootstudy.pojo.SysUser;
import zone.reborn.springbootstudy.service.SysUserService;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年8月10日 下午2:23:05
 * @Description 类描述
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	public int insert(SysUser sysUser) {
		return sysUserMapper.insert(sysUser);
	}

	@Override
	public int updateByPrimaryKey(SysUser record) {
		return sysUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		return sysUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public SysUser selectByPrimaryKey(int id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysUser> selectAll() {
		return sysUserMapper.selectAll();
	}

	@Override
	public List<SysUser> selecPaged(SysUser sysUser, Integer page, int pageSize) {
		// 开始分页
		PageHelper.startPage(page, pageSize);
		
		Example example = new Example(SysUser.class);
		Criteria criteria = example.createCriteria();
		if(StringUtils.isNotBlank(sysUser.getName())) {
			criteria.andLike("name", "%"+sysUser.getName()+"%");
		}
		example.orderBy("id");
		
		List<SysUser> sysUserList = sysUserMapper.selectByExample(example);
		
		return sysUserList;
	}

}
