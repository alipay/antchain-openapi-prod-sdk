// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetOperatorResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 操作员创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // 操作员所在的企业
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    // 邮箱
    @NameInMap("email")
    @Validation(required = true)
    public String email;

    // 外部对接系统操作员ID
    @NameInMap("external_id")
    @Validation(required = true)
    public String externalId;

    // 外部对接系统类型
    @NameInMap("external_system")
    @Validation(required = true)
    public String externalSystem;

    // 操作员ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 昵称
    @NameInMap("nickname")
    @Validation(required = true)
    public String nickname;

    // 真实姓名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 用户加入的租户列表
    @NameInMap("tenants")
    @Validation(required = true)
    public java.util.List<String> tenants;

    // 操作员最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    public String updateTime;

    public static GetOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperatorResponse self = new GetOperatorResponse();
        return TeaModel.build(map, self);
    }

    public GetOperatorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetOperatorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOperatorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetOperatorResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetOperatorResponse setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public GetOperatorResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetOperatorResponse setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public GetOperatorResponse setExternalSystem(String externalSystem) {
        this.externalSystem = externalSystem;
        return this;
    }
    public String getExternalSystem() {
        return this.externalSystem;
    }

    public GetOperatorResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetOperatorResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetOperatorResponse setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public GetOperatorResponse setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public GetOperatorResponse setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public GetOperatorResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetOperatorResponse setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

    public GetOperatorResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
