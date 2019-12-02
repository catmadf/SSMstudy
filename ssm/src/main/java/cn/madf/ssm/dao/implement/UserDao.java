package cn.madf.ssm.dao.implement;

import cn.madf.ssm.dao.BaseDao;
import cn.madf.ssm.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/21 20:53
 * @copyright© 2019
 */

/**
 * @author 烛影鸾书
 * "userDao" 可以不用写， 默认为类名第一个字母小写
 */
@Repository("userDao")
public class UserDao extends AbstractDao<User> implements BaseDao<User> {

    public void insert(User user) {
        getSqlSession().insert("users.insert", user);
    }

    public void update(User user) {
        getSqlSession().insert("users.update", user);
    }

    public void delete(Integer id) {
        getSqlSession().insert("users.delete", id);
    }

    public User selectOne(Integer id) {
        return getSqlSession().selectOne("users.selectOne", id);
    }

    public List<User> selectAll() {
        return getSqlSession().selectList("users.selectAll");
    }
}
