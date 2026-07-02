// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartTenantBindinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实体did
    @NameInMap("did")
    public String did;

    // 非openapi访问模式https鉴权key_id,  暂保留
    @NameInMap("key_id")
    public String keyId;

    // 非openapi访问模式https鉴权key_secret,  暂保留
    @NameInMap("key_secret")
    public String keySecret;

    // 交易唯一ID
    @NameInMap("nonce")
    public String nonce;

    public static StartTenantBindinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTenantBindinfoResponse self = new StartTenantBindinfoResponse();
        return TeaModel.build(map, self);
    }

    public StartTenantBindinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartTenantBindinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartTenantBindinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartTenantBindinfoResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartTenantBindinfoResponse setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public StartTenantBindinfoResponse setKeySecret(String keySecret) {
        this.keySecret = keySecret;
        return this;
    }
    public String getKeySecret() {
        return this.keySecret;
    }

    public StartTenantBindinfoResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
