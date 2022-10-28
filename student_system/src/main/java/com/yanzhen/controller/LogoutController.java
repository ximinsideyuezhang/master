package com.yanzhen.controller;

import com.yanzhen.entity.Student;
import com.yanzhen.entity.Teacher;
import com.yanzhen.entity.User;
import com.yanzhen.service.StudentService;
import com.yanzhen.service.TeacherService;
import com.yanzhen.service.UserService;
import com.yanzhen.utils.MapControll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LogoutController {


    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:login";
    }

}
