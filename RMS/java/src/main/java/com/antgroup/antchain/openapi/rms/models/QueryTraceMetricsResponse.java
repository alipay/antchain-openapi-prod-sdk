// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceMetricsResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // metrics reulsts
    @NameInMap("result")
    public TimeSeriesMetrics result;

    public static QueryTraceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceMetricsResponse self = new QueryTraceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceMetricsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceMetricsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceMetricsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceMetricsResponse setResult(TimeSeriesMetrics result) {
        this.result = result;
        return this;
    }
    public TimeSeriesMetrics getResult() {
        return this.result;
    }

}
