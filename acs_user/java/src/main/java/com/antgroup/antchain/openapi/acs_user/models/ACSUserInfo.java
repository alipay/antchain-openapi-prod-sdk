// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class ACSUserInfo extends TeaModel {
    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户名称
    @NameInMap("user_name")
    public String userName;

    // 用户类型，OPERATOR：登录用户；SERVICE：服务用户
    @NameInMap("user_type")
    public String userType;

    // 是否已失效
    @NameInMap("expired")
    public Boolean expired;

    // 是否被禁用
    @NameInMap("disabled")
    public Boolean disabled;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 手机号码
    @NameInMap("phone")
    public String phone;

    // 失效时间
    @NameInMap("expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expiredTime;

    // 创建时间
    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 更新时间
    @NameInMap("update_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String updateTime;

    // 用户角色
    @NameInMap("user_roles")
    public java.util.List<ACSUserRole> userRoles;

    // 账户密码
    @NameInMap("password")
    public String password;

    public static ACSUserInfo build(java.util.Map<String, ?> map) throws Exception {
        ACSUserInfo self = new ACSUserInfo();
        return TeaModel.build(map, self);
    }

    public ACSUserInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ACSUserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ACSUserInfo setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ACSUserInfo setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public ACSUserInfo setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public ACSUserInfo setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ACSUserInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ACSUserInfo setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ACSUserInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ACSUserInfo setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public ACSUserInfo setUserRoles(java.util.List<ACSUserRole> userRoles) {
        this.userRoles = userRoles;
        return this;
    }
    public java.util.List<ACSUserRole> getUserRoles() {
        return this.userRoles;
    }

    public ACSUserInfo setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
