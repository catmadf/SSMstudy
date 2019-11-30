package cn.madf.springMybatis.service.implement;

import cn.madf.springMybatis.dao.BaseDao;
import cn.madf.springMybatis.domain.User;
import cn.madf.springMybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 烛影鸾书
 * @date 2019/11/25 16:52
 * @copyright© 2019
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource(name = "userDao")
    public void setDao(BaseDao<User> dao) {
        /*
          重写方法，注入指定的Dao对象.
         */
        super.setDao(dao);
    }
}
