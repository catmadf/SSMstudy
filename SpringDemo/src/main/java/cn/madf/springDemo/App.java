package cn.madf.springDemo;

import cn.madf.springDemo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 烛影鸾书
 * @date 2019/11/20 20:33
 * @copyright© 2019
 */
public class App {
    public static void main(String[] args) {
        // 创建容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        WelcomeService ws = (WelcomeService) applicationContext.getBean("ws");
        ws.printMessage();
    }

}
