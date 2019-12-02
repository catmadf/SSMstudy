package cn.madf.ssm.service;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/25 16:30
 * @copyright© 2019
 */
public interface BaseServiceInterface<T> {
    /**
     * 插入方法
     * @param t 被插入的实体、可以是User、Item、Order
     */
    public void insert(T t);

    /**
     * 更新方法
     * @param t 需要被更新的实体、可以是User、Item、Order
     */
    public void update(T t);

    /**
     * 删除方法
     * @param id 需要被删除的实体id
     */
    public void delete(Integer id);

    /**
     * 查询一个
     * @param id 实体的id
     * @return 被查询的实体
     */
    public T selectOne(Integer id);

    /**
     * 查询全部
     * @return 被查询的实体集合
     */
    public List<T> selectAll();
}
