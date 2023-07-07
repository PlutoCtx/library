package com.example.library.controller.request;

import lombok.Data;

/**
 * library-management-system
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/7/7 9:24
 * @since JDK17
 */

@Data
public class BaseRequest {

    private Integer pageNum = 1;
    private Integer pageSize = 10;
}
