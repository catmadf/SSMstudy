package cn.madf.ssm.service.implement;

import cn.madf.ssm.dao.BaseDao;
import cn.madf.ssm.service.BaseServiceInterface;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/25 17:13
 * @copyright© 2019
 */
public abstract class AbstractService<T> implements BaseServiceInterface<T> {

    private BaseDao<T> dao;

    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    public void insert(T t) {
        dao.insert(t);
    }

    public void update(T t) {
        dao.update(t);
    }

    public void delete(Integer id) {
        dao.delete(id);
    }

    public T selectOne(Integer id) {
        return dao.selectOne(id);
    }

    public List<T> selectAll() {
        return dao.selectAll();
    }
}
