package com.sys.pojo;
// User Class

public class User {
    private int uid;//user id
    private String username;//user name
    private String password;//password
    private String usex;// user sex
    private String nickname;// nickname

    public User() {
        super();
    }
    public User(int uid, String username, String password, String usex, String nickname) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.usex = usex;
        this.nickname = nickname;
    }

    public User(String username, String nickname) {
        super();
        this.username = username;
        this.nickname = nickname;
    }

    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsex() {
        return usex;
    }
    public void setUsex(String usex) {
        this.usex = usex;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", usex=" + usex
                + ", nickname=" + nickname + "]";
    }

}
