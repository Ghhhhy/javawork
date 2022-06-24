package com.bosssoft.hr.javase.HashMapExample;
/*
 *
 * @author DELL
 * @date 2022/06/232332
 **/

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    private Map<Integer,User> map=new HashMap();

    User put(Integer key, User value) // user.id 作为key  返回存入的 user
    {
        return map.put(key, value);
    }

    User remove(Integer key) {
        return map.remove(key);
    }

    boolean containsKey(Integer key) //判断时候元素是否存在
    {
        return map.containsKey(key);
    }

    void visitByEntrySet() {// 考察多种遍历方式
        map.entrySet();
    }

    void visitByKeySet() {
        map.keySet();
    }

    void visitByValues() {
        map.values();
    }

}
