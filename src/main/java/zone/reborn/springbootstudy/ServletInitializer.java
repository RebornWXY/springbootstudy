package zone.reborn.springbootstudy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @author 作者: reborn
 * @version 创建时间: 2018年7月15日 下午3:59:45
 * @description 类说明:
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootStudyApplication.class);
	}

}
