package org.hackerandpainter.springbootscheduler.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-05 10:17
 **/
public class ScheduledCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //读取配置中的属性
        return Boolean.parseBoolean(context.getEnvironment().getProperty("enable.scheduled"));
    }
}
