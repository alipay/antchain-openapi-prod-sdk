// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class VerifySessionTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户名称
    @NameInMap("user_name")
    public String userName;

    // 私有化中的租户ID（0表示适用所有租户）
    @NameInMap("tenant_id")
    public Long tenantId;

    // 用户类型，OPERATOR：登录账号；SERVICE：服务账号
    @NameInMap("user_type")
    public String userType;

    // 是否已失效
    @NameInMap("expired")
    public Boolean expired;

    // 是否已冻结
    @NameInMap("disabled")
    public Boolean disabled;

    // 邮箱地址
    @NameInMap("email")
    public String email;

    // 电话号码
    @NameInMap("phone")
    public String phone;

    // 失效时间
    @NameInMap("expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expiredTime;

    // 是否需要修改密码
    @NameInMap("change_required")
    public Boolean changeRequired;

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

    public VerifySessionTokenResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifySessionTokenResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public VerifySessionTokenResponse setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public VerifySessionTokenResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public VerifySessionTokenResponse setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public VerifySessionTokenResponse setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public VerifySessionTokenResponse setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public VerifySessionTokenResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public VerifySessionTokenResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public VerifySessionTokenResponse setChangeRequired(Boolean changeRequired) {
        this.changeRequired = changeRequired;
        return this;
    }
    public Boolean getChangeRequired() {
        return this.changeRequired;
    }

}
