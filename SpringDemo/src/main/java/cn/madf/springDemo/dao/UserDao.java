package cn.madf.springDemo.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 烛影鸾书
 * @date 2019/11/21 11:10
 * @copyright© 2019
 */
@Repository("userDao")
public class UserDao {

    public void insert(){
        System.out.println("Insert Over!");
    }

}
