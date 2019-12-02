package cn.madf.ssm.domain;

/**
 * @author 烛影鸾书
 * @date 2019/12/2 20:30
 * @copyright© 2019
 */
public class Item {
    private int id;
    private String itemName;

    private User user;
    private Order order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
