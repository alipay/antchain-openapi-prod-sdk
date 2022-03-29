// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsBacklogResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结束时间
    @NameInMap("end_time")
    public Long endTime;

    // 每个时间点间隔（毫秒）
    @NameInMap("interval")
    public Long interval;

    // 数据点
    // 
    @NameInMap("metrics")
    public java.util.List<BacklogMetricItem> metrics;

    // 开始时间
    @NameInMap("start_time")
    public Long startTime;

    public static QueryMetricsBacklogResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsBacklogResponse self = new QueryMetricsBacklogResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricsBacklogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetricsBacklogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetricsBacklogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetricsBacklogResponse setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricsBacklogResponse setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public QueryMetricsBacklogResponse setMetrics(java.util.List<BacklogMetricItem> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<BacklogMetricItem> getMetrics() {
        return this.metrics;
    }

    public QueryMetricsBacklogResponse setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
