package zone.reborn.springbootstudy.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author 作者: reborn
 * @version 创建时间: 2018年7月15日 下午3:59:45
 * @description 类说明:用户实体类
 */
public class User {

	private String name;

	@JsonIgnore // 利用底层jackson注解
	private String password;

	private Integer age;

	@JsonFormat(pattern = "yy-MM-dd HH:mm:ss a", locale = "zh", timezone = "GMT+8")//yy-MM-dd HH:mm:ss
	private Date birthday;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
