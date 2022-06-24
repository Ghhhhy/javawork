package com.bosssoft.hr.javase.springexample.api;

import com.bosssoft.hr.javase.springexample.pojo.dto.UserDTO;
import com.bosssoft.hr.javase.springexample.pojo.query.UserQuery;
import com.bosssoft.hr.javase.springexample.pojo.vo.UserVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value ="/demo/user")
/**
 * @author DELL
 *  请规范注释
 */
public interface UserApi {


        @PostMapping(value = "")
        @ResponseBody
        /**
         * 请规范注释
         */
        Boolean add(@RequestBody @Validated UserDTO UserDTO);

        /**
         * 在service方法中要启用PageHelper启用分页查询
         */
        @GetMapping(value = "")
        List<UserVO> search(UserQuery userQuery);

        @DeleteMapping(value = "")
        Boolean delete(Long id);

    }

