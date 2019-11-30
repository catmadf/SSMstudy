package cn.madf.springMybatis.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/21 20:46
 * @copyright© 2019
 */
public interface BaseDao<T> {
    public void insert(T t);

    public void update(T t);

    public void delete(Integer id);

    public T selectOne(Integer id);

    public List<T> selectAll();
}
