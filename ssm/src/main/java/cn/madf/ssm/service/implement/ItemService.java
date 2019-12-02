package cn.madf.ssm.service.implement;

import cn.madf.ssm.dao.BaseDao;
import cn.madf.ssm.domain.Item;
import cn.madf.ssm.service.ItemServiceInterface;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 烛影鸾书
 * @date 2019/11/27 15:44
 * @copyright© 2019
 */
@Service("itemService")
public class ItemService extends AbstractService<Item> implements ItemServiceInterface {

    @Override
    @Resource(name = "itemDao")
    public void setDao(BaseDao<Item> dao) {
        super.setDao(dao);
    }
}
