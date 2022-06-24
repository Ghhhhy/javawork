package com.bosssoft.hr.javase.dom4jpaser;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author DELL
 */
public class Dom4jPaser implements Paser{
    @Override
    public User[] parse(String url){
        // 第一种方式：创建文档，并创建根元素
        // 创建文档:使用了一个Helper类
        Document document = DocumentHelper.createDocument();
        // 创建根节点并添加进文档
        Element root = DocumentHelper.createElement("user");
        document.setRootElement(root);
        Element element = root.element("users");
        for(Iterator iterator = element.elementIterator("users"); iterator.hasNext();) {
            User[] elem = (User[]) iterator.next();
        }
        User[] users = new User[5];
        return users;
    }
    TreeSet<User> users = new TreeSet<>((user1, user2) -> {
        if (!user1.age.equals(user2.age)){
            return user1.age - user2.age;
        }
        return user2.id - user1.id;
    });

}
