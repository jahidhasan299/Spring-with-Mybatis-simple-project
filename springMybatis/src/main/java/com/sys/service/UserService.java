package com.sys.service;
import com.sys.pojo.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public boolean addUser(User user) throws Exception;
    public List<User> selectUser(int uid) throws SQLException;
    public int deleteUser(int uid) throws Exception;
}
