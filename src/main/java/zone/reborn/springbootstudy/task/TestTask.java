package zone.reborn.springbootstudy.task;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Reborn.Wang
 * @createDate 创建时间：2018年8月17日 下午5:01:23
 * @Description 类描述
 */
@Component
public class TestTask {
	
	// @Scheduled(fixedRate = 3000)
	@Scheduled(cron = "4-30 * * * * ? ") // 在线cron表达式生成：http://cron.qqe2.com/
	public void reportCurrentTime() {
		System.out.println(LocalDate.now()+";"+LocalTime.now());
	}
	
}
