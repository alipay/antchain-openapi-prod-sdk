// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitNotaryOpenapiMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 本次认证的唯一标识，商户需要记录，后续的操作都需要用到
    @NameInMap("biz_no")
    public String bizNo;

    // 生成的认证地址，需要转换成二维码通过支付宝APP打开
    @NameInMap("verify_url")
    public String verifyUrl;

    public static InitNotaryOpenapiMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        InitNotaryOpenapiMerchantResponse self = new InitNotaryOpenapiMerchantResponse();
        return TeaModel.build(map, self);
    }

    public InitNotaryOpenapiMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitNotaryOpenapiMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitNotaryOpenapiMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitNotaryOpenapiMerchantResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public InitNotaryOpenapiMerchantResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

}
