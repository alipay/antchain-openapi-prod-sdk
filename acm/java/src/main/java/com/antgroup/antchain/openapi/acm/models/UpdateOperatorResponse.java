// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class UpdateOperatorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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

    public static UpdateOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperatorResponse self = new UpdateOperatorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOperatorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateOperatorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateOperatorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateOperatorResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UpdateOperatorResponse setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public UpdateOperatorResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateOperatorResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateOperatorResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public UpdateOperatorResponse setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UpdateOperatorResponse setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public UpdateOperatorResponse setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public UpdateOperatorResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateOperatorResponse setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

    public UpdateOperatorResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
