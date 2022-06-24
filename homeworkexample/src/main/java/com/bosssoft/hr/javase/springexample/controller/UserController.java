package com.bosssoft.hr.javase.springexample.controller;


import com.bosssoft.hr.javase.springexample.api.UserApi;
import com.bosssoft.hr.javase.springexample.pojo.dto.UserDTO;
import com.bosssoft.hr.javase.springexample.pojo.entity.User;
import com.bosssoft.hr.javase.springexample.pojo.query.UserQuery;
import com.bosssoft.hr.javase.springexample.pojo.vo.UserVO;
import com.bosssoft.hr.javase.springexample.service.UserService;
import com.bosssoft.hr.javase.springexample.util.Results;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
    * @author DELL
    * @date 2022/06/221921
**/
public class UserController implements UserApi {
    @Autowired
    UserService userService;

    @Override
    public Boolean add(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<UserVO> search(UserQuery userQuery) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @RequestMapping("/allByPage")
    public Results allBookByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                 @RequestParam(defaultValue = "5") Integer pageSize){
        //为了程序的严谨性，判断非空：
        if(pageNum == null){
            pageNum = 1;
        }
        if(pageNum <= 0){
            pageNum = 1;
        }
        if(pageSize == null){
            pageSize = 5;
        }
        List<User> users = userService.queryUserByPage(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(users,pageSize);
        return Results.success(pageInfo);
    }

}
