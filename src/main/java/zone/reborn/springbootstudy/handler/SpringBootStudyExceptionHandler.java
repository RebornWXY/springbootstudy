package zone.reborn.springbootstudy.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年7月27日 下午1:30:14
 * @Description 类描述 全局异常处理器
 */
@ControllerAdvice
public class SpringBootStudyExceptionHandler {

	public static final String SPRINGBOOTSTUDY_ERROR_VIEWNAME = "error";

	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {

		e.printStackTrace();
		
		if(isAjax(request)) {
			return "ajax"; //在正常开发中会进行返回结果的数据封装，这里只是简单的演示操作。
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.addObject("url", request.getRequestURL());
		mv.setViewName(SPRINGBOOTSTUDY_ERROR_VIEWNAME);
		// mv.setViewName("/center/center.ftl");//不知道为什么，两个模板同时开启，始终加载不了freemarker的视图，等待考究
		// mv.setViewName("/center/center.html");
		return mv;
	}
	
	/**
	 * @param request
	 * @description 判断是否是Ajax请求
	 */
	public static boolean isAjax(HttpServletRequest request) {
		return (request.getHeader("X-Requested-With") != null
				&& "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
	}

}
