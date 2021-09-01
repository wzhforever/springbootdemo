package com.example.demo.entity;


public class UserInformationDemo {

  private Integer id;
//  private String userName;
private String user_name;
  private String user_sex;
  private String user_address;
  private String user_password;
//  private String userSex;
//  private String userAddress;
//  private String userPassword;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

//
//  public String getUserName() {
//    return userName;
//  }
//
//  public void setUserName(String userName) {
//    this.userName = userName;
//  }
//
//
//  public String getUserSex() {
//    return userSex;
//  }
//
//  public void setUserSex(String userSex) {
//    this.userSex = userSex;
//  }
//
//
//  public String getUserAddress() {
//    return userAddress;
//  }
//
//  public void setUserAddress(String userAddress) {
//    this.userAddress = userAddress;
//  }
//
//
//  public String getUserPassword() {
//    return userPassword;
//  }
//
//  public void setUserPassword(String userPassword) {
//    this.userPassword = userPassword;
//  }
//
//  public String toString(){
//    System.out.println("用户名："+this.getUserName()+"\n性别："+this.getUserSex()+"\n地址："+this.getUserAddress());
//
//    return "用户名："+this.getUserName()+"\n性别："+this.getUserSex()+"\n地址："+this.getUserAddress();
//  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getUser_sex() {
    return user_sex;
  }

  public void setUser_sex(String user_sex) {
    this.user_sex = user_sex;
  }

  public String getUser_address() {
    return user_address;
  }

  public void setUser_address(String user_address) {
    this.user_address = user_address;
  }

  public String getUser_password() {
    return user_password;
  }

  public void setUser_password(String user_password) {
    this.user_password = user_password;
  }

  @Override
  public String toString() {
    return "UserInformation{" +
            "id=" + id +
            ", user_name='" + user_name + '\'' +
            ", user_sex='" + user_sex + '\'' +
            ", user_address='" + user_address + '\'' +
            ", user_password='" + user_password + '\'' +
            '}';
  }
}
