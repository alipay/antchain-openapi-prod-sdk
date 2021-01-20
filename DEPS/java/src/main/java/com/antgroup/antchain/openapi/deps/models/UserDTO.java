// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UserDTO extends TeaModel {
    // customerId
    @NameInMap("customer_id")
    public String customerId;

    // name
    @NameInMap("name")
    public String name;

    // realName
    @NameInMap("real_name")
    public String realName;

    // type
    @NameInMap("type")
    public String type;

    // 用户id
    @NameInMap("id")
    public String id;

    // 登录名称
    @NameInMap("login_name")
    public String loginName;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    public static UserDTO build(java.util.Map<String, ?> map) throws Exception {
        UserDTO self = new UserDTO();
        return TeaModel.build(map, self);
    }

    public UserDTO setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public UserDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserDTO setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public UserDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UserDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UserDTO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UserDTO setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
