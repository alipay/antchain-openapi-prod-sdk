// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsInstancehistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 历史统计数据
    @NameInMap("metrics")
    public java.util.List<TopicGroupHistoryStatsItem> metrics;

    public static QueryMetricsInstancehistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsInstancehistoryResponse self = new QueryMetricsInstancehistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricsInstancehistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetricsInstancehistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetricsInstancehistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetricsInstancehistoryResponse setMetrics(java.util.List<TopicGroupHistoryStatsItem> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<TopicGroupHistoryStatsItem> getMetrics() {
        return this.metrics;
    }

}
