package com.bosssoft.hr.javase.MyQueueEx;
/*
 *
 * @author DELL
 * @date 2022/06/232355
 **/

class MyQueueExample {
        public void testQueueAdd(){
            Queue<User> users=new MyQueue();
            users.offer(new User("李一"));
            users.offer(new User("李二"));
            users.offer(new User("李三"));
            users.offer(new User("李四"));
            users.add(new User("李五"));
            assert (users.peek()==new User("李五")):"";
            // 使用add方法加入5个用户
            // 断言数量正确  否则抛出异常
        }
        public void testQueueRemove(){
            Queue<User> users=new MyQueue();
            users.add(new User("李一"));
            users.add(new User("李二"));
            users.add(new User("李三"));
            users.add(new User("李四"));
            users.add(new User("李五"));
            for (int i=0;i<6;i++){
                users.poll();
            }
            assert (users.poll()==null):users.remove();


            // 使用add方法加入5个用户
            //  循环6次删除poll队列首，断言第6次为false
        }
}


