package cn.madf.mybatisDemo.test;

import cn.madf.mybatisDemo.domain.Order;
import cn.madf.mybatisDemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 烛影鸾书<3 7 5 1 7 4 1 0 2 @ qq.com>
 * @date 2019/11/10 16:36
 * @copyright© 2019
 */

public class TestCRUD {

    @Test
    public void insert() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        User u = new User();
        u.setName("Frank");
        u.setAge(15);
        sSession.insert("users.insert", u);
        sSession.commit();
        sSession.close();
    }

    @Test
    public void update() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        User u = new User();
        u.setId(1);
        u.setName("Alice");
        u.setAge(20);
        sSession.update("users.update", u);
        sSession.commit();
        sSession.close();
    }

    @Test
    public void selectOne() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        User u = sSession.selectOne("users.selectOne", 1);
        System.out.println(u.getName());
        for (Order order : u.getOrders()) {
            System.out.println(order.getId()+"\t"+order.getOrderNo());
        }
        sSession.commit();
        sSession.close();
    }

    @Test
    public void selectAll() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        List<User> users = sSession.selectList("users.selectAll");
        for (User user : users) {
            System.out.println(user.getName() + '\t' + user.getAge());
        }
        sSession.commit();
        sSession.close();
    }

    @Test
    public void delete() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        sSession.delete("users.delete", 1);
        sSession.commit();
        sSession.close();
    }


}
