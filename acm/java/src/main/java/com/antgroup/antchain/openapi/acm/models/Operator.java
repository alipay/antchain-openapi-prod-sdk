// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class Operator extends TeaModel {
    // 操作员创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 操作员所在的企业
    @NameInMap("customer")
    public String customer;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 外部对接系统操作员id
    @NameInMap("external_id")
    public String externalId;

    // 外部对接系统类型
    @NameInMap("external_system")
    public String externalSystem;

    // 操作员ID
    @NameInMap("id")
    public String id;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 昵称
    @NameInMap("nickname")
    public String nickname;

    // 真实姓名
    @NameInMap("real_name")
    public String realName;

    // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
    @NameInMap("status")
    public String status;

    // 操作员加入的租户列表
    @NameInMap("tenants")
    public java.util.List<String> tenants;

    // 操作员最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static Operator build(java.util.Map<String, ?> map) throws Exception {
        Operator self = new Operator();
        return TeaModel.build(map, self);
    }

    public Operator setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Operator setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public Operator setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Operator setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public Operator setExternalSystem(String externalSystem) {
        this.externalSystem = externalSystem;
        return this;
    }
    public String getExternalSystem() {
        return this.externalSystem;
    }

    public Operator setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Operator setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public Operator setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public Operator setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public Operator setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public Operator setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Operator setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

    public Operator setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
