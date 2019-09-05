package org.hackerandpainter.springbootscheduler.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description 通过@Scheduled创建任务
 * @Author Gao Hang Hang
 * @Date 2019-09-05 09:59
 **/
@Component
@Slf4j
public class TestTask {

    private static DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    //@Scheduled(fixedDelay = 1000)
    //public void test01() {
    //    log.info("test01 start");
    //    System.out.println("执行业务逻辑...");
    //    log.info("test01 end");
    //}
    //
    //@Scheduled(fixedDelay = 1000)
    //public void test02() {
    //    log.info("test02 start");
    //    System.out.println("");
    //    try {
    //        Thread.sleep(60 * 1000);
    //    } catch (InterruptedException e) {
    //        e.printStackTrace();
    //    }
    //    log.info("test02 end");
    //}

    //// 5秒执行一次
    //@Scheduled(cron = "0/5 * * * * ?")
    //public void test(){
    //    System.out.println(dateFmt.format(LocalDateTime.now()) + " : 执行定时任务");
    //}

    // 动态配置定时任务
    @Scheduled(cron = "${scheduled.cron}")
    public void test(){
        System.out.println(dateFmt.format(LocalDateTime.now()) + " : 执行定时任务");
    }
}
