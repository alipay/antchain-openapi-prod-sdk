// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetAccessorResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Accessor关联的AccessKey
    @NameInMap("access_key")
    public String accessKey;

    // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    @NameInMap("access_secret")
    public String accessSecret;

    // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
    @NameInMap("account")
    public String account;

    // AccessKey创建时间，ISO8601格式
    @NameInMap("create_time")
    public String createTime;

    // Accessor唯一标识
    @NameInMap("id")
    public String id;

    // 关联的租户
    @NameInMap("tenant")
    public String tenant;

    // Accessor类型(RAM/ACCOUNT)
    @NameInMap("type")
    public String type;

    // 关联的用户ID
    @NameInMap("userId")
    public String userId;

    public static GetAccessorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessorResponse self = new GetAccessorResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAccessorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAccessorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAccessorResponse setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetAccessorResponse setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public GetAccessorResponse setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public GetAccessorResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetAccessorResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAccessorResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetAccessorResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetAccessorResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
