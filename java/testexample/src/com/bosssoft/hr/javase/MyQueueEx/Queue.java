package com.bosssoft.hr.javase.MyQueueEx;

/**
 * @author DELL
 */
public interface Queue<T> {
    boolean add(T data);// 加入失败抛出异常
    boolean offer(T data);//加入失败返回false
    T remove();//移除队首 如果队列空则抛出异常
    T poll();//移除队首
    T element();//取得队首元素
    T peek();// 取得队首元素如果队列为空则抛出异常

}
