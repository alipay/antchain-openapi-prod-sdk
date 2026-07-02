// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AuthFundCreditgrantingResponse extends TeaModel {
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

    public static AuthFundCreditgrantingResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthFundCreditgrantingResponse self = new AuthFundCreditgrantingResponse();
        return TeaModel.build(map, self);
    }

    public AuthFundCreditgrantingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthFundCreditgrantingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthFundCreditgrantingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthFundCreditgrantingResponse setMerchantAuthUrl(String merchantAuthUrl) {
        this.merchantAuthUrl = merchantAuthUrl;
        return this;
    }
    public String getMerchantAuthUrl() {
        return this.merchantAuthUrl;
    }

    public AuthFundCreditgrantingResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

}
