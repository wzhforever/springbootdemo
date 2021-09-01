package com.example.demo.entity;


import java.util.List;

public class UserInformation {

  private Integer id;
  private String userName;
  private String userSex;
  private String userAddress;
  private String userPassword;
  private List<UserAddress> userAddresses;


  public List<UserAddress> getUserAddresses() {
    return userAddresses;
  }

  public void setUserAddresses(List<UserAddress> userAddresses) {
    this.userAddresses = userAddresses;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }


  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  @Override
  public String toString(){
    return "用户名："+this.getUserName()+"\n性别："+this.getUserSex()+"\n地址："+this.getUserAddress()+this.userAddresses.toArray().toString();
  }

}
