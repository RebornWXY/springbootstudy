package zone.reborn.springbootstudy.service;

import java.util.List;

import zone.reborn.springbootstudy.pojo.SysUser;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年8月10日 下午2:22:10
 * @Description 类描述
 */
public interface SysUserService {

	int insert(SysUser sysUser);

	int updateByPrimaryKey(SysUser record);

	int deleteByPrimaryKey(int id);

	SysUser selectByPrimaryKey(int id);

	List<SysUser> selectAll();

	List<SysUser> selecPaged(SysUser sysUser, Integer page, int pageSize);

	SysUser queyUserByIdCustomize(int id);
}
