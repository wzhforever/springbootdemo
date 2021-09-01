package com.example.demo.service;

import com.example.demo.controller.UserInformationController;
import com.example.demo.entity.UserAddress;
import com.example.demo.entity.UserInformation;
import com.example.demo.mapper.UserInforemationMapper;
import com.example.demo.utils.RedisUtils;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserInforemationService {
    private static final Logger LOG = LoggerFactory.getLogger(UserInforemationService.class);

    @Autowired
    UserInforemationMapper userInforemationMapper;

    @Resource
    RedisUtils redisUtils;

    public UserInformation getUser(int id) {
        UserInformation user = null;
        try {
            user = userInforemationMapper.getUser(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }


    public UserInformation getUserByUser(UserInformation user){
        return userInforemationMapper.getUserByUser(user);
    }

    public List<UserInformation> getUsers(){
        List<UserInformation> list = new ArrayList<UserInformation>();
        if (redisUtils.hashKey("users")){
            list = (List<UserInformation>) redisUtils.get("users");
            System.out.println("********************从缓存中"+list.size());
        }else{
            list = userInforemationMapper.getUsers();
            System.out.println("********************从数据库中取"+list.size());
            //放进缓存中
            redisUtils.set("users",userInforemationMapper.getUsers());
        }
        return list;
    }

    public UserInformation getUserOneToMany(String addressType){
        return userInforemationMapper.getUserOneToMany(addressType);
    }

    @Transactional
    public void addUser(UserInformation user){
        userInforemationMapper.addUser(user);
    }
    @Transactional
    public void updateUser(UserInformation user){
        userInforemationMapper.updateUser(user);
    }
    @Transactional
    public boolean deleteUser(UserInformation user){
        boolean flag = userInforemationMapper.deleteUser(user);
        return flag;
    }

}
