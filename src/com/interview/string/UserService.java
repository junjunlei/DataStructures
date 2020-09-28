package com.interview.string;

/**
 * 用户Service
 * @author Jerry
 * @create 2020-08-21 15:15
 */
public interface UserService {
    /**
     * 模拟登录
     * @param userName
     * @param passWord
     */
    default void login(String userName,String passWord){
        System.out.println("登录的用户名为："+userName+"密码为"+passWord);
    }
}
