// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryUnifiedalarmMetricsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 指标数据
    @NameInMap("results")
    public java.util.List<UnifiedAlarmMetric> results;

    public static QueryUnifiedalarmMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnifiedalarmMetricsResponse self = new QueryUnifiedalarmMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnifiedalarmMetricsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnifiedalarmMetricsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnifiedalarmMetricsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnifiedalarmMetricsResponse setResults(java.util.List<UnifiedAlarmMetric> results) {
        this.results = results;
        return this;
    }
    public java.util.List<UnifiedAlarmMetric> getResults() {
        return this.results;
    }

}
