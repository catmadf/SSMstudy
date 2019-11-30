package cn.madf.springMybatis.dao.implement;

import cn.madf.springMybatis.dao.BaseDao;
import cn.madf.springMybatis.domain.Item;
import cn.madf.springMybatis.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/27 15:41
 * @copyright© 2019
 */
@Repository("itemDao")
public class ItemDao extends  AbstractDao<Item> implements BaseDao<Item> {

    public void insert(Item item) {
        getSqlSession().insert("items.insert");
    }

    public void update(Item item) {
        getSqlSession().insert("items.update");
    }

    public void delete(Integer id) {
        getSqlSession().insert("items.delete");
    }

    public Item selectOne(Integer id) {
        return getSqlSession().selectOne("items.selectOne", id);
    }

    public List<Item> selectAll() {
        return getSqlSession().selectList("items.selectAll");
    }
}
