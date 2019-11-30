package cn.madf.springMybatis.test;

import cn.madf.springMybatis.domain.Item;
import cn.madf.springMybatis.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/27 15:40
 * @copyright© 2019
 */
public class TestItem {

    @Test
    public void testItemDao(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ItemService itemService = (ItemService) ac.getBean("itemService");
        List<Item> items = itemService.selectList();
        for (Item item : items) {
            System.out.println(item.getId()+"  "+item.getItemName()+"  "+item.getOrder().getOrderNo()+"  "+item.getOrder().getUser().getName());
        }
    }
}
