package cn.madf.springMVC.domain;

/**
 * @author 烛影鸾书
 * @date 2019/11/28 20:30
 * @copyright© 2019
 */
public class User {
    private int id;
    private String name;
    private int age;

//    public User(){
//
//    }

//    public User(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }

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
}
