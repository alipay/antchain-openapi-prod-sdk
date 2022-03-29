// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsTghistoryResponse extends TeaModel {
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

    // 消息点之间的时间间隔（秒），默认为 1
    @NameInMap("interval")
    public Long interval;

    // 具体的统计值
    @NameInMap("metrics")
    public java.util.List<TopicGroupHistoryStatsItem> metrics;

    // 开始时间
    @NameInMap("start_time")
    public Long startTime;

    public static QueryMetricsTghistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsTghistoryResponse self = new QueryMetricsTghistoryResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricsTghistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetricsTghistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetricsTghistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetricsTghistoryResponse setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricsTghistoryResponse setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public QueryMetricsTghistoryResponse setMetrics(java.util.List<TopicGroupHistoryStatsItem> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<TopicGroupHistoryStatsItem> getMetrics() {
        return this.metrics;
    }

    public QueryMetricsTghistoryResponse setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
