package cn.madf.ssm.domain;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/12/2 20:29
 * @copyright© 2019
 */
public class Order {
    private int id;
    private String orderNo;

    private User user;
    private List<Item> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
