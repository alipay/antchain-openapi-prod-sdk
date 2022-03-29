// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceApprpcservermetricsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("result")
    public java.util.List<TimeSeriesMetrics> result;

    public static QueryTraceApprpcservermetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceApprpcservermetricsResponse self = new QueryTraceApprpcservermetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceApprpcservermetricsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceApprpcservermetricsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceApprpcservermetricsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceApprpcservermetricsResponse setResult(java.util.List<TimeSeriesMetrics> result) {
        this.result = result;
        return this;
    }
    public java.util.List<TimeSeriesMetrics> getResult() {
        return this.result;
    }

}
