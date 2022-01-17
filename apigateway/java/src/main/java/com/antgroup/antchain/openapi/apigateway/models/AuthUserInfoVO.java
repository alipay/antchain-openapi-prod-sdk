// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class AuthUserInfoVO extends TeaModel {
    // api分组标识符
    @NameInMap("api_group_id")
    public String apiGroupId;

    // api标识符
    @NameInMap("api_id")
    public String apiId;

    // 授权状态
    @NameInMap("auth_status")
    public String authStatus;

    // 授权用户唯一标识
    @NameInMap("auth_user_id")
    public String authUserId;

    // 企业的唯一标识
    @NameInMap("customer")
    public String customer;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 创建日期
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 昵称
    @NameInMap("nick_name")
    public String nickName;

    // operator
    @NameInMap("operator")
    public String operator;

    // 真实性名
    @NameInMap("real_name")
    public String realName;

    // 操作员状态
    @NameInMap("status")
    public String status;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 用户标识
    @NameInMap("user_id")
    public String userId;

    // workspace id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 工号
    @NameInMap("work_no")
    public String workNo;

    // 能否操作授权
    @NameInMap("can_auth")
    public Boolean canAuth;

    public static AuthUserInfoVO build(java.util.Map<String, ?> map) throws Exception {
        AuthUserInfoVO self = new AuthUserInfoVO();
        return TeaModel.build(map, self);
    }

    public AuthUserInfoVO setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public AuthUserInfoVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public AuthUserInfoVO setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public AuthUserInfoVO setAuthUserId(String authUserId) {
        this.authUserId = authUserId;
        return this;
    }
    public String getAuthUserId() {
        return this.authUserId;
    }

    public AuthUserInfoVO setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public AuthUserInfoVO setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public AuthUserInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AuthUserInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AuthUserInfoVO setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public AuthUserInfoVO setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public AuthUserInfoVO setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public AuthUserInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AuthUserInfoVO setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public AuthUserInfoVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AuthUserInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AuthUserInfoVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AuthUserInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AuthUserInfoVO setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

    public AuthUserInfoVO setCanAuth(Boolean canAuth) {
        this.canAuth = canAuth;
        return this;
    }
    public Boolean getCanAuth() {
        return this.canAuth;
    }

}
