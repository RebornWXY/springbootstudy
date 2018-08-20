/**
 * 
 */
package zone.reborn.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author reborn
 * @createDate 创建时间：2018年8月19日 下午9:06:43
 * @description 类说明：
 *
 */
@Controller
@RequestMapping(value = "/one")
public class OneController {
	
	@GetMapping(value = "/index")
	public String index(ModelMap mm) {
		mm.addAttribute("name", "reborn");
		return "/index";
	}
	
}
