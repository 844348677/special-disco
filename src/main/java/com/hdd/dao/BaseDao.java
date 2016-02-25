package com.hdd.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by liuh on 2016/2/2.
 */
public interface BaseDao<T> {

    /**
     * 根据主键ID获得一条记录
     *
     * @param id
     * @return
     */
    T findObject(Object id) throws Exception;


    /**
     * 获得所有数据
     *
     * @return
     */
    List<T> findObjectList() throws Exception;


    /**
     * 根据删除一条记录
     *
     * @param entity
     */
    void deleteObject(T entity) throws Exception;


    /**
     * 插入一条记录
     *
     * @param entity
     */
    void insertObject(T entity) throws Exception;


    /**
     * 更新一条记录
     *
     * @param entity
     */
    void updateObject(T entity) throws Exception;


    /**
     * 根据分页信息获得数据列表
     *
     * @param page
     *            页码（第几页）
     * @param rows
     *            行数（显示多少行）
     * @return
     * @throws Exception
     */
    List<T> findObjectListByPagination(Integer page, Integer rows) throws Exception;


    /**
     * 分页并按参数查询【只做EQ比较】
     *
     * @param page
     * @param rows
     * @param params
     * @return
     * @throws Exception
     */
    List<T> find(Integer page, Integer rows, Map<String, Object> params) throws Exception;


    /**
     * 统计对象的总行数
     *
     * @return
     * @throws Exception
     */
    Integer findCountObjectTotal() throws Exception;


    /**
     * 根据查询参数获取对象列表【只做EQ比较】
     *
     * @param params
     * @return
     * @throws Exception
     */
    List<T> findObjectListByParams(Map<String, Object> params) throws Exception;


    /**
     * 根据条件删除数据
     *
     * @param params
     * @throws Exception
     */
    void deleteObjectByParams(Map<String, Object> params) throws Exception;


    /**
     * 根据参数字段查询记录数据 用来判断可否满足删除条件
     */
    @SuppressWarnings("rawtypes")
    Integer findRecordCountByFiele(String fieldName, Long fieldValue, Class entity);


    /**
     * 在适当的情况下使用原生SQL操作数据库
     *
     * @param sql
     * @return 影响行数
     * @throws Exception
     */
    int excuteSql(String sql) throws Exception;

}
