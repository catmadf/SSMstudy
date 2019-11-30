package cn.madf.springMybatis.domain;

import java.util.List;

/**
 * @author 烛影鸾书<3 7 5 1 7 4 1 0 2 @ qq.com>
 * @date 2019/11/10 16:13
 * @copyright© 2019
 */
public class User {
    private Integer id;
    private String name;
    private int age;

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
