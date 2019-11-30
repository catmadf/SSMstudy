package cn.madf.springMybatis.dao.implement;

import cn.madf.springMybatis.dao.BaseDao;
import cn.madf.springMybatis.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/21 21:01
 * @copyright© 2019
 */
@Repository("orderDao")
public class OrderDao extends AbstractDao<Order> implements BaseDao<Order> {
    public void insert(Order order) {
        getSqlSession().insert("orders.insert", order);
    }

    public void update(Order order) {
        getSqlSession().update("orders.update", order);
    }

    public void delete(Integer id) {
        getSqlSession().delete("orders.delete", id);
    }

    public Order selectOne(Integer id) {
        return getSqlSession().selectOne("orders.selectOne", id);
    }

    public List<Order> selectAll() {
        return getSqlSession().selectList("orders.selectAll");
    }
}
