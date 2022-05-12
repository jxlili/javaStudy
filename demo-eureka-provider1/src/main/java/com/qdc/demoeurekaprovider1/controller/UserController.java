package com.qdc.demoeurekaprovider1.controller;

import com.qdc.demoeurekaprovider1.pojo.User;
import com.qdc.demoeurekaprovider1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Value("${spring.cloud.client.ip-address}")
    String ipaddr;
    @Value("${server.port}")
    int port;


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/details",method = RequestMethod.GET)
    public User selectUserById(@RequestParam(value = "userid",required = true)String id){
        User user = userService.selectUserById(id);
        return user;
    }

    //接受前端传过来的数据也是json格式
    //把json格式转化为user对象
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    //post,get是http协议的数据的方法
    public boolean adduser(@RequestBody User user){
        return userService.adduser(user);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public boolean updataUser(@RequestBody User user){
        return userService.updataUser(user);
    }

    @RequestMapping(value = "/del",method = RequestMethod.DELETE)
    public boolean deleteUser(@RequestParam(value = "name",required = true)String name){
        return userService.deleteUser(name);
    }

    @RequestMapping(value = "/userall",method = RequestMethod.GET)
    public List<User> selectAllUsers(){
        List<User> users = userService.selectAllUsers();
        return users;
    }

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "sleep_seconds" ,required = true) int sleep_seconds)
            throws InterruptedException {
        System.out.println("休眠时间" + sleep_seconds);
        Thread.sleep(sleep_seconds*1000);
        return "Hello,我在" + ipaddr + ":" + port;

    }
    }
