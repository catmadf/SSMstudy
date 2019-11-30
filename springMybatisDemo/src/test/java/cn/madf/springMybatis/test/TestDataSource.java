package cn.madf.springMybatis.test;

import cn.madf.springMybatis.dao.BaseDao;
import cn.madf.springMybatis.dao.implement.UserDao;
import cn.madf.springMybatis.domain.User;
import cn.madf.springMybatis.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/21 19:37
 * @copyright© 2019
 */
public class TestDataSource {

    /**
     * 测试数据源
     */
    @Test
    public void testCnnect() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource dataSource = (DataSource) ac.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testUserService() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        BaseDao<User> dao = (UserDao) ac.getBean("userDao");
        UserService userService = (UserService) ac.getBean("userService");

        List<User> userList = userService.selectList();
        for (User user : userList) {
            System.out.println(user.getName());
        }
    }

}
