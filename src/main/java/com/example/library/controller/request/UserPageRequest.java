package com.example.library.controller.request;

import lombok.Data;

/**
 * library-management-system
 * 用户分页
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/7/7 9:23
 * @since JDK17
 */

@Data
public class UserPageRequest extends BaseRequest{

    private String name;
    private String phone;

}
