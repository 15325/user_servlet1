package com.cs.dao;

import com.cs.entity.User;

import java.util.List;

public interface UserDao {

    //查询数据的总记录数
    public int findByCountUser()throws Exception;

    //分页方法
    public List<User> findByPageUserInfo(int pageNo, int pageSize) throws Exception;

    //通过Id查询用户信息
    public User findByidUserInfo(int id)throws Exception;

    //根据Id修改用户信息
    public int updateUser(User us) throws Exception;

    //根据Id删除用户信息
    public int delUser(int id)throws Exception;

}
