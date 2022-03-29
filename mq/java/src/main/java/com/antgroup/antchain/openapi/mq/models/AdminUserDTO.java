// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class AdminUserDTO extends TeaModel {
    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 数据库id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 昵称
    @NameInMap("nick_name")
    @Validation(required = true)
    public String nickName;

    // 真实姓名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // 用户类型
    @NameInMap("user_type")
    @Validation(required = true)
    public Long userType;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    public static AdminUserDTO build(java.util.Map<String, ?> map) throws Exception {
        AdminUserDTO self = new AdminUserDTO();
        return TeaModel.build(map, self);
    }

    public AdminUserDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AdminUserDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AdminUserDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AdminUserDTO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public AdminUserDTO setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public AdminUserDTO setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public AdminUserDTO setUserType(Long userType) {
        this.userType = userType;
        return this;
    }
    public Long getUserType() {
        return this.userType;
    }

    public AdminUserDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
