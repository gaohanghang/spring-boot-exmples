package org.hackerandpainter.springbootscheduler.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/**
 * @Description 修改Spring Scheculed 默认线程池
 * @Author Gao Hang Hang
 * @Date 2019-09-05 09:59
 **/
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(new ScheduledThreadPoolExecutor(10,
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r, "my-schedule-pool");
                    }
                }));
    }
}
