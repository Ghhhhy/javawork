package com.bosssoft.hr.javase.TreeSetExample;


import java.io.Serializable;
/*
 * @author DELL
 * @date 2022/06/231701
 **/
public class User implements Serializable,Comparable<User>{
    private static final long serialVersionUID = 190512204190251207L;

    /**
     * 从1 开始增加 排序使用该字段
     */
    public Integer id;
    /**
     * 名字 建议“user”+id
     */
    private String name;
    public static int i=0;

    public User(String name){
        this.id=++i;
        this.name=name;
    }

    @Override
    public String toString(){
        return "{id:"+id+",name:"+name+"}";
    }

    @Override
    public int compareTo(User o) {
        return this.id-o.id;
    }
}
