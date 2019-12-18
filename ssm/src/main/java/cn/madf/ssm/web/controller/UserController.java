package cn.madf.ssm.web.controller;

import cn.madf.ssm.domain.User;
import cn.madf.ssm.service.implement.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 烛影鸾书
 * @date 2019/12/16 20:32
 * @copyright© 2019
 */
@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService us;

    /**
     * 查看全部user
     */
    @RequestMapping(value = {"/user/findAll"})
    public String findAll(Model model){
        List<User> userList = us.selectAll();
        /* 往模型中添加结果，"users" 即为查询结果的逻辑名，前端通过改名字获取查询结果 */
        model.addAttribute("users", userList);
        return "user/users";
    }
}
