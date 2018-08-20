/**
 * 
 */
package zone.reborn.springbootstudy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import zone.reborn.springbootstudy.interceptor.OneInterceptor;
import zone.reborn.springbootstudy.interceptor.TwoInterceptor;

/**
 * @author reborn
 * @createDate 创建时间：2018年8月19日 下午8:44:18
 * @description 类说明：
 *
 */
@Configuration
public class WebMVCConfigurer extends WebMvcConfigurationSupport {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport#
	 * addInterceptors(org.springframework.web.servlet.config.annotation.
	 * InterceptorRegistry)
	 */
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		registry.addInterceptor(new OneInterceptor())
									.addPathPatterns("/one/**");
									// .addPathPatterns("/**");
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**");
		
		super.addInterceptors(registry);
	}

}
