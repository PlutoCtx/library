package com.example.library.service;

import com.example.library.controller.request.UserPageRequest;
import com.example.library.entity.User;

import java.util.List;

/**
 * library-management-system
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/7/6 22:55
 * @since JDK17
 */


public interface IUserService {

    List<User> list();

    Object page(UserPageRequest userPageRequest);
}
