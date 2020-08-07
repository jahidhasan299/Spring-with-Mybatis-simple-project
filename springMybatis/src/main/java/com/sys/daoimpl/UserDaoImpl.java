package com.sys.daoimpl;
import com.sys.dao.UserDao;
import com.sys.pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class UserDaoImpl implements UserDao {
    @Override
    public int addUser(User user) throws SQLException {
        int num = 0;
        String sql = null;
        try {
            sql = "insert into user(username, password, usex,nickname) values(?,?,?,?)";
            Object[] params = { user.getUsername(), user.getPassword(), user.getUsex(), user.getNickname() };
            System.out.println("num=" + num);
        } catch (Exception e) {
        } finally {
            sql = null;
        }
        return num;
    }

}
