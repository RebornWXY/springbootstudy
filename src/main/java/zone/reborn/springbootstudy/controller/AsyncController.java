/**
 * 
 */
package zone.reborn.springbootstudy.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zone.reborn.springbootstudy.task.AsyncTask;

/**
 * @author reborn
 * @createDate 创建时间：2018年8月19日 下午12:50:33
 * @description 类说明：
 *
 */
@RestController
@RequestMapping(value = "/async")
public class AsyncController {

	@Autowired
	private AsyncTask asyncTask;

	@RequestMapping(value = "/test1")
	public String test1() throws Exception {
		long start = System.currentTimeMillis();

		Future<Boolean> a = asyncTask.doTask11();
		Future<Boolean> b = asyncTask.doTask22();
		Future<Boolean> c = asyncTask.doTask33();

		while (!a.isDone() || !b.isDone() || !c.isDone()) {
			if (a.isDone() && b.isDone() && c.isDone()) {
				break;
			}
		}
		
		long end = System.currentTimeMillis();
		String times = "任务全部完成，总耗时：" + (end - start);
		System.out.println(times);
		return times;
	}

}
