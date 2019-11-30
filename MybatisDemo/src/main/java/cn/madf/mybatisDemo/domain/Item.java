package cn.madf.mybatisDemo.domain;

/**
 * @author 烛影鸾书<3 7 5 1 7 4 1 0 2 @ qq.com>
 * 订单项
 * @date 2019/11/11 15:13
 * @copyright© 2019
 */
public class Item {
    private Integer id;
    private String itemName;
    // 订单项和订单关联
    private Order order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
