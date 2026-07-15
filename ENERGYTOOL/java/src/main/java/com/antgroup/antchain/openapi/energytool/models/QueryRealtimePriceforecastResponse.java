// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryRealtimePriceforecastResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 电价预测结果	
    // 
    @NameInMap("result")
    public java.util.List<PricePredictionItem> result;

    public static QueryRealtimePriceforecastResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRealtimePriceforecastResponse self = new QueryRealtimePriceforecastResponse();
        return TeaModel.build(map, self);
    }

    public QueryRealtimePriceforecastResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRealtimePriceforecastResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRealtimePriceforecastResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRealtimePriceforecastResponse setResult(java.util.List<PricePredictionItem> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PricePredictionItem> getResult() {
        return this.result;
    }

}
