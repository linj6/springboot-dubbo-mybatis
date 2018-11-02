package com.lnjecit.common.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity 实体基类
 * 适用于主键id为int类型
 *
 * @author lnj
 * @createTime 2018-11-01 16:01
 **/
@Data
@EqualsAndHashCode
public class BaseEntity implements Serializable {

    /**
     * 唯一标识
     */
    private Long id;

    /**
     * 创建人id
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 修改人id
     */
    private Long updateUserId;

    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 删除标识 1:正常 0:已删除
     */
    private Integer del;

}