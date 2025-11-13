// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InitInnerFundmngmerchantpromiseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户履约计划初始化数据
    @NameInMap("merchant_promise_info")
    public String merchantPromiseInfo;

    public static InitInnerFundmngmerchantpromiseResponse build(java.util.Map<String, ?> map) throws Exception {
        InitInnerFundmngmerchantpromiseResponse self = new InitInnerFundmngmerchantpromiseResponse();
        return TeaModel.build(map, self);
    }

    public InitInnerFundmngmerchantpromiseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitInnerFundmngmerchantpromiseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitInnerFundmngmerchantpromiseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitInnerFundmngmerchantpromiseResponse setMerchantPromiseInfo(String merchantPromiseInfo) {
        this.merchantPromiseInfo = merchantPromiseInfo;
        return this;
    }
    public String getMerchantPromiseInfo() {
        return this.merchantPromiseInfo;
    }

}
