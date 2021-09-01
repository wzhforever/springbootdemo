package com.example.demo.mapper;

import com.example.demo.entity.UserAddress;
import com.example.demo.entity.UserInformation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserInforemationMapper {

    public UserInformation getUser(int id);

    public UserInformation getUserByUser(UserInformation user);

    public List<UserInformation> getUsers();

    public UserInformation getUserOneToMany(String addressType);

    public void addUser(UserInformation user);

    public void updateUser(UserInformation user);

    public boolean deleteUser(UserInformation user);

}
