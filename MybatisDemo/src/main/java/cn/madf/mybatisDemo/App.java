package cn.madf.mybatisDemo;

import cn.madf.mybatisDemo.dao.UserDao;
import cn.madf.mybatisDemo.domain.User;

import java.util.List;

/**
 * @author 烛影鸾书<3 7 5 1 7 4 1 0 2 @ qq.com>
 * @date 2019/11/8 21:19
 * @copyright© 2019
 */
public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        List<User> userList = userDao.selectAll();
        for (User user : userList) {
            System.out.println(user.getName());
        }
    }
}
