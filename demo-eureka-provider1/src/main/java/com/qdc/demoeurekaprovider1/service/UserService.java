package com.qdc.demoeurekaprovider1.service;

import com.qdc.demoeurekaprovider1.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public User selectUserById(String id){
        return new User("aaa","123","zip");
    }

    public List<User> selectAllUsers(){
        ArrayList<User> users = new ArrayList<>();
        User u1 = new User("tsh","dsad","dwsda");
        User u2 = new User("tshsdad","dssadssadad","dwsddasda");
        users.add(u1);
        users.add(u2);
        return users;
    }

    public boolean adduser(User user){
        return true;
    }

    public boolean updataUser(User user){
        return true;
    }

    public boolean deleteUser(String name){
        return true;
    }
}
