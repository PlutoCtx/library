package com.example.library.mapper;

import com.example.library.controller.request.UserPageRequest;
import com.example.library.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * library-management-system
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/7/6 22:53
 * @since JDK17
 */

@Mapper
public interface UserMapper {

//    @Select("SELECT * FROM user")
    List<User> list();

    List<User> listByCondition(UserPageRequest userPageRequest);
}
