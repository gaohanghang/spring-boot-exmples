package org.hackerandpainter.springbootmybatisplus.user;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.hackerandpainter.springbootmybatisplus.SpringBootMybatisPlusApplicationTests;
import org.hackerandpainter.springbootmybatisplus.dao.UserMapper;
import org.hackerandpainter.springbootmybatisplus.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class SimpleTest extends SpringBootMybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setName("丁茂义");
        user.setAge(40);
        user.setEmail("dmy@baomidou.com");
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(LocalDateTime.now());
        int rows = userMapper.insert(user);
        System.out.println("影响记录数：" + rows);
        System.out.println("主键：" + user.getId());
    }

    @Test
    public void select() {
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
