package cn.madf.springMVC.mockDatabase;

import cn.madf.springMVC.domain.User;
import netscape.security.UserTarget;
import sun.rmi.server.UnicastServerRef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/29 11:02
 * @copyright© 2019
 */
public class DB {
    private static HashMap<Integer, User> tables = new HashMap<Integer, User>();

    static {
        int userNum = 100;
        for (int i = 1; i <= userNum; i++) {
            User user = new User();
            user.setId(i);
            user.setName("tom" + i);
            user.setAge(10 + (35 + i) * i * i % 20);
            tables.put(i, user);
        }
    }

    public static List<User> findAll() {
        return new ArrayList<User>(tables.values());
    }

    public static void deleteOne(int uid) {
        tables.remove(uid);
    }

    public static User select(int uid){
        return tables.get(uid);
    }

    public static void updateOne(User user){
        tables.put(user.getId(), user);
    }
}
