// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class InitVerifyResponse extends TeaModel {
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

    public static InitVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InitVerifyResponse self = new InitVerifyResponse();
        return TeaModel.build(map, self);
    }

    public InitVerifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitVerifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitVerifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitVerifyResponse setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public InitVerifyResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

    public InitVerifyResponse setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
        return this;
    }
    public String getVerifyStatus() {
        return this.verifyStatus;
    }

    public InitVerifyResponse setValidProd(java.util.List<GwValidateProduct> validProd) {
        this.validProd = validProd;
        return this;
    }
    public java.util.List<GwValidateProduct> getValidProd() {
        return this.validProd;
    }

}
