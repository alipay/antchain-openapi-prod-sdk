// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetTenantIaasaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 账户关联的AccessKey
    @NameInMap("access_key")
    public String accessKey;

    // 账户关联的AccessSecret
    @NameInMap("access_secret")
    public String accessSecret;

    // IaaS账户名
    @NameInMap("account")
    public String account;

    // 创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // IaaS账户id
    @NameInMap("id")
    public String id;

    // sts token
    @NameInMap("access_token")
    public String accessToken;

    // 是否是sts模式
    @NameInMap("sts_mode")
    public Boolean stsMode;

    public static GetTenantIaasaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTenantIaasaccountResponse self = new GetTenantIaasaccountResponse();
        return TeaModel.build(map, self);
    }

    public GetTenantIaasaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTenantIaasaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTenantIaasaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTenantIaasaccountResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetTenantIaasaccountResponse setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public GetTenantIaasaccountResponse setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public GetTenantIaasaccountResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTenantIaasaccountResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetTenantIaasaccountResponse setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetTenantIaasaccountResponse setStsMode(Boolean stsMode) {
        this.stsMode = stsMode;
        return this;
    }
    public Boolean getStsMode() {
        return this.stsMode;
    }

}
