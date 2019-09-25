package org.hackerandpainter.springbootmybatisplus.user;

import java.time.LocalDateTime;
import java.util.Date;

import org.hackerandpainter.springbootmybatisplus.SpringBootMybatisPlusApplicationTests;
import org.hackerandpainter.springbootmybatisplus.entity.User;
import org.junit.Test;



public class ARTest extends SpringBootMybatisPlusApplicationTests {

    @Test
    public void insert() {
        User user = new User();
        user.setName("丁茂义");
        user.setAge(40);
        user.setEmail("dmy@baomidou.com");
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(LocalDateTime.now());
        boolean flag = user.insert();
        System.out.println("是否成功：" + flag);
    }

    @Test
    public void selectById1() {
        User user = new User();
        User userSelect = user.selectById(1134351388596264961L);
        System.out.println(userSelect == user);
        System.out.println(userSelect);
    }

    @Test
    public void selectById2() {
        User user = new User();
        user.setId(1134351388596264961L);
        User userSelect = user.selectById();
        System.out.println(userSelect == user);
        System.out.println(userSelect);
    }

    @Test
    public void updateById() {
        User user = new User();
        user.setId(1134351388596264961L);
        user.setName("张无忌@@@");
        boolean flag = user.updateById();
        System.out.println("是否成功：" + flag);
    }

    @Test
    public void deleteById() {
        User user = new User();
        user.setId(1134351388596264961L);
        boolean flag = user.deleteById();
        System.out.println("是否成功：" + flag);
    }

    @Test
    public void insertOrUpdate() {
        User user = new User();
        user.setId(1134354221018144770L);
        user.setAge(35);
        user.setCreateTime(LocalDateTime.now());
        boolean flag = user.insertOrUpdate();
        System.out.println("是否成功：" + flag);
    }
}
