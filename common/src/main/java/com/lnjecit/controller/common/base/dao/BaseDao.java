package com.lnjecit.controller.common.base.dao;

import com.lnjecit.controller.common.base.domain.BaseEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BaseDao<E extends BaseEntity> {

    /**
     * 新增
     *
     * @param entity
     * @return
     */
    int insert(E entity);

    /**
     * 修改
     *
     * @param entity
     * @return
     */
    int update(E entity);

    /**
     * 通过id物理删除
     *
     * @param id
     * @return
     */
    int deletePhysical(@Param("id") Long id);

    /**
     * 物理删除（适用于根据多个参数来删除记录）
     *
     * @param entity
     * @return
     */
    int deletePhysical(E entity);

    /**
     * 通过id逻辑删除 设置del字段值为0
     *
     * @param id
     * @return
     */
    int deleteLogical(@Param("id") Long id);

    /**
     * 逻辑删除（适用于根据多个参数来删除记录）
     *
     * @param entity
     * @return
     */
    int deleteLogical(E entity);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    E getById(@Param("id") Long id);

    /**
     * 根据参数查询返回持久化对象集合
     *
     * @param param 查询参数
     * @return
     */
    List<E> query(Map<String, Object> param);

    /**
     * 查询全部持久化对象
     *
     * @return
     */
    List<E> queryAll();

    /**
     * 分页查询
     *
     * @param param
     * @return
     */
    List<E> queryPage(Map<String, Object> param);

}
