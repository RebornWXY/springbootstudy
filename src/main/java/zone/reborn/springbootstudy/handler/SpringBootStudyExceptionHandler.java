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

	public static final String SPRINGBOOTSTUDY_ERROR_VIEWNAME = "/error";

	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {

		e.printStackTrace();

		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.addObject("url", request.getRequestURL());
		mv.setViewName(SPRINGBOOTSTUDY_ERROR_VIEWNAME);
		return mv;
	}

}
