package cn.madf.ssm.service.implement;

import cn.madf.ssm.dao.BaseDao;
import cn.madf.ssm.domain.Order;
import cn.madf.ssm.service.OrderServiceInterface;

import javax.annotation.Resource;

/**
 * @author 烛影鸾书
 * @date 2019/12/2 21:09
 * @copyright© 2019
 */
public class OrderService extends AbstractService<Order> implements OrderServiceInterface {

    @Override
    @Resource(name = "itemDao")
    public void setDao(BaseDao<Order> dao) {
        super.setDao(dao);
    }

}
