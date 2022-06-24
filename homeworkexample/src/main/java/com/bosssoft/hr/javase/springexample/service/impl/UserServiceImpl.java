package com.bosssoft.hr.javase.springexample.service.impl;/*
 *
 * @author DELL
 * @date 2022/06/221916
 **/

import com.bosssoft.hr.javase.springexample.dao.UserMapper;
import com.bosssoft.hr.javase.springexample.exception.GlobalException;
import com.bosssoft.hr.javase.springexample.pojo.entity.User;
import com.bosssoft.hr.javase.springexample.service.UserService;
import com.bosssoft.hr.javase.springexample.util.result.ResultCode;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        try {
            return userMapper.selectAll();
        }catch (Exception ex){
            log.error(ex.getMessage(),ex);
            throw new GlobalException(ResultCode.DATA_READ_ERROR,ex);
        }
    }

    @Override
    public boolean insert(User user) {
        if (user==null) {return false;}
        try {
            return  1!=userMapper.insert(user);
        }catch (Exception ex){
            log.error(ex.getMessage(),ex);
            throw new GlobalException(ResultCode.INSERT_FAIL,ex);
        }

    }

    @Override
    public boolean remove(Long id) {
        if (id==null){ return false;}
        try {
            return (-1 != userMapper.delete(id));
        }catch (Exception ex){
            log.error(ex.getMessage(),ex);
            throw new GlobalException(ResultCode.DEL_FAIL,ex);
        }
    }

    @Override
    public boolean update(User user) {
        if (user==null||user.getId()==null) {return false;}
        try {
            return (-1 != userMapper.update(user));
        }catch (Exception ex){
            log.error(ex.getMessage(),ex);
            throw new GlobalException(ResultCode.INSERT_FAIL,ex);
        }
    }
    //分页查询功能
    @Override
    public List<User> queryUserByPage(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectAll();
    }



//    @Override
//    public User getUserByName(String name) {
//        if (name==null) {return null;}
//        try {
//            return userMapper.selectByName(name);
//        }catch (Exception ex){
//            log.error(ex.getMessage(),ex);
//            throw new GlobalException(ResultCode.INSERT_FAIL,ex);
//        }
//
//    }
//
//    @Override
//    public boolean login(String username, String password) {
//        try {
//            if (username==null||password==null) {return false;}
//            User user = userMapper.selectByName(username);
//            return user.getPassword().equals(password)&&user.getName().equals(username);
//        }catch (Exception e){
//            log.error(e.getMessage(),e);
//            throw new GlobalException(ResultCode.PASSWORD_ERROR,e);
//        }
//    }
}
