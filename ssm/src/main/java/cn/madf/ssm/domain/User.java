package cn.madf.ssm.domain;

import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/12/2 20:07
 * @copyright© 2019
 */
public class User {

    private int id;
    private String name;
    private int age;

    private List<Order> orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
