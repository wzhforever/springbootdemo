package com.example.demo.entity;


public class UserAddress {

  private Integer id;
  private String addressCname;
  private String addressType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getAddressCname() {
    return addressCname;
  }

  public void setAddressCname(String addressCname) {
    this.addressCname = addressCname;
  }


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public String toString(){
    System.out.println("ID:" + this.getId() +"地址类型："+this.getAddressType()+" 地址中文名："+this.getAddressCname());
    return "ID:" + this.getId() +"地址类型："+this.getAddressType()+" 地址中文名："+this.getAddressCname();
  }

}
