// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class QueryEaglepromoMarketingriskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // success
    @NameInMap("success")
    public Boolean success;

    // message
    @NameInMap("message")
    public String message;

    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public MarketingRiskData data;

    public static QueryEaglepromoMarketingriskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEaglepromoMarketingriskResponse self = new QueryEaglepromoMarketingriskResponse();
        return TeaModel.build(map, self);
    }

    public QueryEaglepromoMarketingriskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEaglepromoMarketingriskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEaglepromoMarketingriskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEaglepromoMarketingriskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEaglepromoMarketingriskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEaglepromoMarketingriskResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryEaglepromoMarketingriskResponse setData(MarketingRiskData data) {
        this.data = data;
        return this;
    }
    public MarketingRiskData getData() {
        return this.data;
    }

}
