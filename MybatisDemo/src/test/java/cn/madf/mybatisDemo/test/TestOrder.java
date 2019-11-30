package cn.madf.mybatisDemo.test;

import cn.madf.mybatisDemo.domain.Item;
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

public class TestOrder {

    @Test
    public void insert() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        User user = new User();
        user.setId(2);

        Order order = new Order();
        order.setOrderNo("No005");
        order.setUser(user);

        sSession.insert("orders.insert", order);
        sSession.commit();
        sSession.close();
    }

    @Test
    public void selectOne() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        Order o = sSession.selectOne("orders.selectOne", 1);
        System.out.println(o.getId()+"\t"+o.getOrderNo()+"\t"+o.getUser().getName());
        for (Item i : o.getItems()){
            System.out.println(i.getItemName());
        }
        sSession.commit();
        sSession.close();
    }

    @Test
    public void selectAll() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sSessionFactory = new SqlSessionFactoryBuilder().build(inStream);
        SqlSession sSession = sSessionFactory.openSession();

        List<Order> orders = sSession.selectList("orders.selectAll");
        for (Order order : orders) {
            System.out.println(order.getOrderNo() + ":" + order.getUser().getName());
        }
        sSession.commit();
        sSession.close();
    }
}
