package org.hackerandpainter.springbootscheduler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;

/**
 * @Description 配置是否开启定时任务
 * @Author Gao Hang Hang
 * @Date 2019-09-05 10:17
 **/
@Configuration
public class ScheduledConfig {

    @Conditional(ScheduledCondition.class)
    @Bean
    public ScheduledAnnotationBeanPostProcessor processor() {
        return new ScheduledAnnotationBeanPostProcessor();
    }
}
