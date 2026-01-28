// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class AuthAntchainAtoFundCreditgrantingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商家授权链接
    @NameInMap("merchant_auth_url")
    public String merchantAuthUrl;

    // 传入的auth_id
    @NameInMap("auth_id")
    public String authId;

    public static AuthAntchainAtoFundCreditgrantingResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthAntchainAtoFundCreditgrantingResponse self = new AuthAntchainAtoFundCreditgrantingResponse();
        return TeaModel.build(map, self);
    }

    public AuthAntchainAtoFundCreditgrantingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthAntchainAtoFundCreditgrantingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthAntchainAtoFundCreditgrantingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthAntchainAtoFundCreditgrantingResponse setMerchantAuthUrl(String merchantAuthUrl) {
        this.merchantAuthUrl = merchantAuthUrl;
        return this;
    }
    public String getMerchantAuthUrl() {
        return this.merchantAuthUrl;
    }

    public AuthAntchainAtoFundCreditgrantingResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

}
