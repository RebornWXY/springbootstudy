package zone.reborn.springbootstudy.mapper;

import tk.mybatis.mapper.common.Mapper;
import zone.reborn.springbootstudy.pojo.SysUser;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年8月14日 下午3:45:59
 * @Description 类描述
 */
public interface SysUserMapperCustomize extends Mapper<SysUser> {
	SysUser queryUserSimplyInfoById(int id);
}
