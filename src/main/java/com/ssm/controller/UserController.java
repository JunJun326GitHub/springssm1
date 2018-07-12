package com.ssm.controller;

import com.ssm.domain.TbScore;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @date 2018/7/7 22:55
 * @since jiangjun
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/selectScore")
    public String selectScore() {
        List<TbScore> list = userService.selectScore();
        System.out.println(list);

        return "";
    }
}
