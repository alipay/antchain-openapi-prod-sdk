// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class VerifySessionTokenResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 用户所在企业的唯一标识
    @NameInMap("customer")
    public String customer;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 用户加入的租户ID列表
    @NameInMap("tenants")
    public java.util.List<String> tenants;

    // session关联的用户id
    @NameInMap("user_id")
    public String userId;

    // 租户详情列表
    @NameInMap("tenant_details")
    public java.util.List<Tenant> tenantDetails;

    public static VerifySessionTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifySessionTokenResponse self = new VerifySessionTokenResponse();
        return TeaModel.build(map, self);
    }

    public VerifySessionTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifySessionTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifySessionTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifySessionTokenResponse setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public VerifySessionTokenResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public VerifySessionTokenResponse setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

    public VerifySessionTokenResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifySessionTokenResponse setTenantDetails(java.util.List<Tenant> tenantDetails) {
        this.tenantDetails = tenantDetails;
        return this;
    }
    public java.util.List<Tenant> getTenantDetails() {
        return this.tenantDetails;
    }

}
