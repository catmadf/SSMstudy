package cn.madf.ssm.service.implement;

import cn.madf.ssm.dao.BaseDao;
import cn.madf.ssm.domain.User;
import cn.madf.ssm.service.UserServiceInterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 烛影鸾书
 * @date 2019/11/25 16:52
 * @copyright© 2019
 */
@Service("userService")
public class UserService extends AbstractService<User> implements UserServiceInterface {

    @Override
    @Resource(name = "userDao")
    public void setDao(BaseDao<User> dao) {
        /*
          重写方法，注入指定的Dao对象.
         */
        super.setDao(dao);
    }
}
