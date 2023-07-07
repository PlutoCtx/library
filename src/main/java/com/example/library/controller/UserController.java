package com.example.library.controller;

import com.example.library.common.Result;
import com.example.library.controller.request.UserPageRequest;
import com.example.library.entity.User;
import com.example.library.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * library-management-system
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/7/6 22:59
 * @since JDK17
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    IUserService userService;

    @GetMapping("/list")
    public Result list() {
        List<User> users = userService.list();
        return Result.success(users);
    }


    @GetMapping("/page")
    public Result page(UserPageRequest userPageRequest) {
        return Result.success(userService.page(userPageRequest));
    }

}
