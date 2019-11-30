package cn.madf.mybatisDemo.domain;

import java.util.List;

/**
 * @author 烛影鸾书<3 7 5 1 7 4 1 0 2 @ qq.com>
 * 订单类
 * @date 2019/11/11 15:11
 * @copyright© 2019
 */
public class Order {
    private Integer id;
    private String orderNo;
    // 简单关联
    private User user;

    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
