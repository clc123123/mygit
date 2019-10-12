package com.entity;

import lombok.Data;

import java.util.Date;

 @Data
public class UserDao {
    private Integer u_id;
    private String u_name;
    private String u_pass;
    private String u_email;
    private String u_phone;
    private String u_tname;
    private String u_sex;
    private String u_address;
    private String u_face;
    private Date u_time;


     public Integer getU_id() {
         return u_id;
     }

     public void setU_id(Integer u_id) {
         this.u_id = u_id;
     }

     public String getU_name() {
         return u_name;
     }

     public void setU_name(String u_name) {
         this.u_name = u_name;
     }

     public String getU_pass() {
         return u_pass;
     }

     public void setU_pass(String u_pass) {
         this.u_pass = u_pass;
     }

     public String getU_email() {
         return u_email;
     }

     public void setU_email(String u_email) {
         this.u_email = u_email;
     }

     public String getU_phone() {
         return u_phone;
     }

     public void setU_phone(String u_phone) {
         this.u_phone = u_phone;
     }

     public String getU_tname() {
         return u_tname;
     }

     public void setU_tname(String u_tname) {
         this.u_tname = u_tname;
     }

     public String getU_sex() {
         return u_sex;
     }

     public void setU_sex(String u_sex) {
         this.u_sex = u_sex;
     }

     public String getU_address() {
         return u_address;
     }

     public void setU_address(String u_address) {
         this.u_address = u_address;
     }

     public String getU_face() {
         return u_face;
     }

     public void setU_face(String u_face) {
         this.u_face = u_face;
     }

     public Date getU_time() {
         return u_time;
     }

     public void setU_time(Date u_time) {
         this.u_time = u_time;
     }

     @Override
     public String toString() {
         return "UserDao{" +
                 "u_id=" + u_id +
                 ", u_name='" + u_name + '\'' +
                 ", u_pass='" + u_pass + '\'' +
                 ", u_email='" + u_email + '\'' +
                 ", u_phone='" + u_phone + '\'' +
                 ", u_tname='" + u_tname + '\'' +
                 ", u_sex='" + u_sex + '\'' +
                 ", u_address='" + u_address + '\'' +
                 ", u_face='" + u_face + '\'' +
                 ", u_time=" + u_time +
                 '}';
     }


 }
