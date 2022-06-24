package com.bosssoft.hr.javase.TreeSetExample;

import java.util.*;

/*
 *
 * @author DELL
 * @date 2022/06/231709
 **/
public class TreeSetExample{

    private Set<User> set=new TreeSet<>();

    public boolean add(User user) {
        return set.add(user);
    }

    public boolean remove(User user) {
        return set.remove(user);
    }

    public boolean contains(User user) {
        return set.contains(user);
    }


    public String sort(User[] users)// 要求内部使用比较器比较
    {
        Arrays.sort(users, Comparator.comparingInt(o -> o.id));
        return Arrays.toString(users);
    }
    public User[] toArray(){
        return (User[]) set.toArray();
    };
}
