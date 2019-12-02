package cn.madf.springMVC.web.controller;

import cn.madf.springMVC.domain.User;
import cn.madf.springMVC.mockDatabase.DB;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/11/28 16:04
 * @copyright© 2019
 */
@Controller
public class RegisterController {

    @RequestMapping(value = {"/toReg"})
    public String toRegView() {
        return "reg";
    }

    @RequestMapping(value = {"/doReg"})
    public String doRegister(HttpServletRequest httpServletRequest) {
        System.out.println("插入数据");
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        System.out.println(username + "  " + password);
        return "index";
    }

    @RequestMapping(value = {"/selectAll"})
    public String selectAll(Model model) {
        List<User> userList = DB.findAll();
        model.addAttribute("userList", userList);
        return "users";
    }

    @RequestMapping(value = {"/deleteOne"})
    public String deleteOne(Model model, @RequestParam("uid") int uid) {
        DB.deleteOne(uid);
        // 请求转发
        return "redirect:/selectAll";
    }

    @RequestMapping(value = {"/updateUser"})
    public String updateUser(Model model, @RequestParam("uid") int uid){
        User user = DB.select(uid);
        model.addAttribute("user", user);
        return "/editUser";
    }

    @RequestMapping(value = {"/updateOne"})
    public String updateOne(User user){
        DB.updateOne(user);
        return "redirect:/selectAll";
    }
}
