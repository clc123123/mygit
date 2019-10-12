package com.entity;

import lombok.Data;

@Data
public class Admin {
    private int adminid; //管理员id
    private String admins;//管理员账号
    private String password;//管理员密码

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdmins() {
        return admins;
    }

    public void setAdmins(String admins) {
        this.admins = admins;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
