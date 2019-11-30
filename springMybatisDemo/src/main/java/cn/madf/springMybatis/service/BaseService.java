package cn.madf.springMybatis.service;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/25 16:30
 * @copyright© 2019
 */
public interface BaseService<T> {
    public void insert(T t);

    public void update(T t);

    public void delete(Integer id);

    public T selectOne(Integer id);

    public List<T> selectList();
}
