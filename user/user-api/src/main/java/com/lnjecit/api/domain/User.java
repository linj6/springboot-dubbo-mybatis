package com.lnjecit.api.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lnj
 * createTime 2018-11-01 14:29
 **/
@Data
public class User implements Serializable {

    private Long id;

    private String username;

    private String password;

    private Long createUserId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long updateUserId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer del;
}
