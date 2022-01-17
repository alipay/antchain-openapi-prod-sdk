// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class OperatorVO extends TeaModel {
    // 创建时间
    @NameInMap("create_time")
    public String createTime;

    // 企业的唯一标识
    @NameInMap("customer")
    public String customer;

    // 邮箱
    @NameInMap("email")
    public String email;

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
    @NameInMap("nick_name")
    public String nickName;

    // 真实姓名
    @NameInMap("real_name")
    public String realName;

    // 操作员状态
    @NameInMap("status")
    public String status;

    // 租户
    @NameInMap("tenants")
    public java.util.List<String> tenants;

    // 操作员最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    // 操作员工号
    @NameInMap("work_no")
    public String workNo;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static OperatorVO build(java.util.Map<String, ?> map) throws Exception {
        OperatorVO self = new OperatorVO();
        return TeaModel.build(map, self);
    }

    public OperatorVO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public OperatorVO setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public OperatorVO setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public OperatorVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OperatorVO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public OperatorVO setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public OperatorVO setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public OperatorVO setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public OperatorVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OperatorVO setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

    public OperatorVO setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public OperatorVO setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public OperatorVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperatorVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
