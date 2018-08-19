/**
 * 
 */
package zone.reborn.springbootstudy.task;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * @author reborn
 * @createDate 创建时间：2018年8月19日 下午12:21:31
 * @description 类说明：
 *
 */
@Component
public class AsyncTask {

	@Async
	public Future<Boolean> doTask11() throws Exception {
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long end = System.currentTimeMillis();
		System.out.println("任务1耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>(true);
	}

	@Async
	public Future<Boolean> doTask22() throws Exception {
		long start = System.currentTimeMillis();
		Thread.sleep(700);
		long end = System.currentTimeMillis();
		System.out.println("任务2耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>(true);
	}

	@Async
	public Future<Boolean> doTask33() throws Exception {
		long start = System.currentTimeMillis();
		Thread.sleep(600);
		long end = System.currentTimeMillis();
		System.out.println("任务3耗时：" + (end - start) + "毫秒");
		return new AsyncResult<>(true);
	}

}
