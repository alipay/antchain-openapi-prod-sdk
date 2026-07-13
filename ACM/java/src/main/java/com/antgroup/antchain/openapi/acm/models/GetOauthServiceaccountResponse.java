// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetOauthServiceaccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务账号AK
    @NameInMap("access_key")
    public String accessKey;

    // 服务账号SK
    @NameInMap("access_secret")
    public String accessSecret;

    // 服务账号别名
    @NameInMap("alias")
    public String alias;

    // 服务账号描述
    @NameInMap("description")
    public String description;

    // 服务账号ID
    @NameInMap("id")
    public String id;

    // 服务名称
    @NameInMap("name")
    public String name;

    // 服务账号归属的账号ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static GetOauthServiceaccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOauthServiceaccountResponse self = new GetOauthServiceaccountResponse();
        return TeaModel.build(map, self);
    }

    public GetOauthServiceaccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetOauthServiceaccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOauthServiceaccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetOauthServiceaccountResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetOauthServiceaccountResponse setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public GetOauthServiceaccountResponse setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public GetOauthServiceaccountResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetOauthServiceaccountResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetOauthServiceaccountResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetOauthServiceaccountResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
