package cn.madf.springDemo.service;

import cn.madf.springDemo.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author 烛影鸾书
 * @date 2019/11/20 20:31
 * @copyright© 2019
 */
@Service("ws")
public class WelcomeService {

    private String message = "hello";
    private UserDao userDao;

    @Resource(name="userDao")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
        userDao.insert();
    }

}
