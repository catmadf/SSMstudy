package cn.madf.springMybatis.service.implement;

import cn.madf.springMybatis.dao.BaseDao;
import cn.madf.springMybatis.domain.Item;
import cn.madf.springMybatis.service.BaseService;
import cn.madf.springMybatis.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 烛影鸾书
 * @date 2019/11/27 15:44
 * @copyright© 2019
 */
@Service("itemService")
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {

    @Resource(name = "itemDao")
    public void setDao(BaseDao<Item> dao) {
        super.setDao(dao);
    }
}
