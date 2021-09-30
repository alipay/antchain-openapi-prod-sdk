// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class QueryPredictResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预测结果返回列表
    @NameInMap("data")
    public java.util.List<PredictResponse> data;

    // 资产包的回款率
    @NameInMap("return_rate")
    public String returnRate;

    public static QueryPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictResponse self = new QueryPredictResponse();
        return TeaModel.build(map, self);
    }

    public QueryPredictResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPredictResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPredictResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPredictResponse setData(java.util.List<PredictResponse> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PredictResponse> getData() {
        return this.data;
    }

    public QueryPredictResponse setReturnRate(String returnRate) {
        this.returnRate = returnRate;
        return this;
    }
    public String getReturnRate() {
        return this.returnRate;
    }

}
