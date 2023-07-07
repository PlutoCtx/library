package com.example.library.service.impl;

import com.example.library.controller.request.UserPageRequest;
import com.example.library.entity.User;
import com.example.library.mapper.UserMapper;
import com.example.library.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * library-management-system
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/7/6 22:56
 * @since JDK17
 */

@Service
public class UserService implements IUserService {


    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public Object page(UserPageRequest userPageRequest){
        PageHelper.startPage(userPageRequest.getPageNum(), userPageRequest.getPageSize());
        List<User> users = userMapper.listByCondition(userPageRequest);
        return new PageInfo<>(users);
    }

}
