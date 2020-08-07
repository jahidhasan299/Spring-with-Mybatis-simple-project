package com.sys.dao;
import com.sys.pojo.User;
import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public int addUser(User user) throws SQLException;
    public List<User> selectUser(int uid) throws SQLException;
    public int deleteUser(int uid) throws Exception;
}
