package zone.reborn.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 作者: reborn
 * @version 创建时间: 2018年7月15日 下午3:59:45
 * @description 类说明:
 */
@SpringBootApplication
// 扫描mybatis mapper包
@MapperScan(basePackages = "zone.reborn.springbootstudy.mapper")
// 开启定时任务
// @EnableScheduling
// 开启异步调用方法
@EnableAsync
public class SpringBootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}

}
