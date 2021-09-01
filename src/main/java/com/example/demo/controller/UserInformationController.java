package com.example.demo.controller;

import com.example.demo.entity.UserAddress;
import com.example.demo.entity.UserInformation;
import com.example.demo.service.UserInforemationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserInformationController {
    private static final Logger LOG = LoggerFactory.getLogger(UserInformationController.class);

    @Autowired
    private UserInforemationService userInforemationService;

    //根据id查询用户
    @RequestMapping("/selectSingleUser/{id}")
    public UserInformation getUser(@PathVariable Integer id){
        UserInformation user = userInforemationService.getUser(id);
        return user;
    }

    //根据实体查询用户
    @PostMapping("/selectUser")
    public UserInformation getUser(@RequestBody UserInformation user){
        UserInformation userInformation = null;
        try{
            userInformation = userInforemationService.getUserByUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userInformation;
    }

    //查询所有用户
    @PostMapping("/selectUsers")
    public List<UserInformation> getUsers(){
        LOG.debug("This is a debug message");
        LOG.info("This is an info message");
        LOG.warn("This is a warn message");
        LOG.error("This is an error message");
        List<UserInformation>  users = userInforemationService.getUsers();
        return users;
    }

    //查询一对多用户
    @PostMapping("/getUserOneToMany")
    public UserInformation getUserOneToMany(@RequestBody UserInformation userInformation){
        UserInformation user = userInforemationService.getUserOneToMany(userInformation.getUserAddress());
        System.out.println(user.toString());
        return user;
    }
//https://www.cnblogs.com/l-y-h/p/12859477.html  mybatis-plus
    @PostMapping("/addUser")
    public void addUser(@RequestBody UserInformation userInformation){
        userInforemationService.addUser(userInformation);
    }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody UserInformation userInformation){
        userInforemationService.updateUser(userInformation);
    }

    @PostMapping("/deleteUser")
    public void deleteUser(@RequestBody UserInformation userInformation){
        boolean flag = userInforemationService.deleteUser(userInformation);
    }


}
