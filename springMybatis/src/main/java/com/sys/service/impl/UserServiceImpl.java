package com.sys.service.impl;

import com.sys.dao.UserDao;
import com.sys.pojo.User;
import com.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) throws Exception {
        boolean flag = true;
        Connection conn = null;
        int num = 0;
        try {
            num = userDao.addUser(user);
            if (num != 1) {
                flag = false;
                System.out.println("Successfully Added New User Details ");
            } else {
                System.out.println("Successfully Added New User Details in Database");
            }
        } catch (Exception e) {
            throw e;
        }
        return flag;
    }

    @Override
    public int deleteUser(int uid) throws Exception {
        int num = userDao.deleteUser(uid);
        return num;
    }

    @Override
    public List<User> selectUser(int uid) throws SQLException {
        List<User> num = userDao.selectUser(uid);
        return num;
    }


}

