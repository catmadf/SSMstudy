package cn.madf.mybatisDemo.dao;

import cn.madf.mybatisDemo.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/19 10:59
 * DAO : 数据访问对象 data access object
 * @copyright© 2019
 */
public class UserDao {

    /**
     * 插入操作
     */
    public void insert(final User user) {  // 内部类调用外部参数，必须是final
        // 匿名内部类
        DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                s.insert("users.insert", user);
                return null;
            }
        });
    }

    /**
     * 更新操作
     */
    public void update(final User user) {
        // 匿名内部类
        DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                s.update("users.update", user);
                return null;
            }
        });
    }

    /**
     * 查询操作
     */
    public User selectOne(final Integer id) {
        return (User) DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                return s.selectOne("users.selectOne", id);
            }
        });
    }

    @SuppressWarnings("unchecked")
    public List<User> selectAll() {
        return (List<User>) DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession s) {
                return s.selectList("users.selectAll");
            }
        });
    }
}
