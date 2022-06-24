package com.bosssoft.hr.javase.dom4jpaser;


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
    public Integer age;
    public String name;
    /**
     * 名字 建议“user”+id
     */
    public static int i=0;

    public User(String name,Integer age,Integer id){
        this.id=id;
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString(){
        return "{id:"+id+",age:"+age+"}";
    }

    @Override
    public int compareTo(User o) {
        return this.id-o.id;
    }
}
