package com.bosssoft.hr.javase.springexample.pojo.query;/*
 *
 * @author DELL
 * @date 2022/06/221939
 **/

import java.util.Objects;

public class UserQuery {
    private String mobile;
    private String email;

    public UserQuery(){
        // 构造函数
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        UserQuery query = (UserQuery) o;
        return Objects.equals(mobile, query.mobile) &&
                Objects.equals(email, query.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobile, email);
    }
}
