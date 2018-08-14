package zone.reborn.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 作者: reborn
 * @version 创建时间: 2018年7月15日 下午3:59:45
 * @description 类说明:
 */
@SpringBootApplication
@MapperScan(basePackages = "zone.reborn.springbootstudy.mapper")
public class SpringBootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}
	
}
