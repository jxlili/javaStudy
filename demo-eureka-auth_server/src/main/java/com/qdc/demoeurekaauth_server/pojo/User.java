package com.qdc.demoeurekaauth_server.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
        private static final long serialVersionUID = 6641328611539019031L;
        private Integer id;
        private String username;
        private String password;
        private String phone;
        private String email;
        private Set<Role> roles = new HashSet<>();
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "GMT+8")
        private Date createTime;

        public static long getSerialVersionUID() {
                return serialVersionUID;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
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

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Set<Role> getRoles() {
                return roles;
        }

        public void setRoles(Set<Role> roles) {
                this.roles = roles;
        }

        public Date getCreateTime() {
                return createTime;
        }

        public void setCreateTime(Date createTime) {
                this.createTime = createTime;
        }
        public User(){}

        public User(Integer id, String username, String password, String phone, String email, Set<Role> roles, Date createTime) {
                this.id = id;
                this.username = username;
                this.password = password;
                this.phone = phone;
                this.email = email;
                this.roles = roles;
                this.createTime = createTime;
        }

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", phone='" + phone + '\'' +
                        ", email='" + email + '\'' +
                        ", roles=" + roles +
                        ", createTime=" + createTime +
                        '}';
        }
}
