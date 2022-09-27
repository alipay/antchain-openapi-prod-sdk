// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class InitAntchainBbpVerifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核身id
    @NameInMap("verify_id")
    public String verifyId;

    // 核身请求地址url
    @NameInMap("verify_url")
    public String verifyUrl;

    // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
    @NameInMap("verify_status")
    public String verifyStatus;

    // 可用产品集合
    @NameInMap("valid_prod")
    public java.util.List<GwValidateProduct> validProd;

    public static InitAntchainBbpVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitAntchainBbpVerifyResponse self = new InitAntchainBbpVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitAntchainBbpVerifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitAntchainBbpVerifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitAntchainBbpVerifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitAntchainBbpVerifyResponse setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public InitAntchainBbpVerifyResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

    public InitAntchainBbpVerifyResponse setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public String getVerifyStatus() {
        return this.verifyStatus;
    }

    public InitAntchainBbpVerifyResponse setValidProd(java.util.List<GwValidateProduct> validProd) {
        this.validProd = validProd;
        return this;
    }
    public java.util.List<GwValidateProduct> getValidProd() {
        return this.validProd;
    }

}
