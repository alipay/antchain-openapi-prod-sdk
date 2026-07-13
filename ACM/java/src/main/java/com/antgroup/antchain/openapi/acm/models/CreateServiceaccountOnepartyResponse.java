// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateServiceaccountOnepartyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // accessKey
    @NameInMap("access_key")
    public String accessKey;

    // accessSecret
    @NameInMap("access_secret")
    public String accessSecret;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户类型
    @NameInMap("user_type")
    public String userType;

    // ak状态
    @NameInMap("status")
    public String status;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static CreateServiceaccountOnepartyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceaccountOnepartyResponse self = new CreateServiceaccountOnepartyResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceaccountOnepartyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateServiceaccountOnepartyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateServiceaccountOnepartyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateServiceaccountOnepartyResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public CreateServiceaccountOnepartyResponse setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public CreateServiceaccountOnepartyResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateServiceaccountOnepartyResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public CreateServiceaccountOnepartyResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateServiceaccountOnepartyResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
