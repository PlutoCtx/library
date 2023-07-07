package com.example.library.entity;

import lombok.Data;

/**
 * library-management-system
 * 用户
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/7/6 22:49
 * @since JDK17
 */

@Data
public class User {

    private Integer id;

    private String name;
    private String username;
    private Integer age;
    private String sex;
    private String phone;
    private String address;
}
