package cn.madf.springMVC.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 烛影鸾书
 * @date 2019/11/28 9:58
 * @copyright© 2019
 */
@Controller
public class HomeController {
    /**
     * 打开主页
     */
    @RequestMapping(value={"/home"})
    public String goHome(){
        System.out.println("hello world");
        return "index";
    }
}
