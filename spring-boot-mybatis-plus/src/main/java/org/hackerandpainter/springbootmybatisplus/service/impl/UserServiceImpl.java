package org.hackerandpainter.springbootmybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hackerandpainter.springbootmybatisplus.entity.User;
import org.hackerandpainter.springbootmybatisplus.service.UserService;
import org.springframework.stereotype.Service;
import org.hackerandpainter.springbootmybatisplus.dao.UserMapper;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
