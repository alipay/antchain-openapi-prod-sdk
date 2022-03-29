// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsTopicResponse extends TeaModel {
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
    // 
    @NameInMap("end_time")
    public Long endTime;

    // 每个数据点间隔（毫秒）
    @NameInMap("interval")
    public Long interval;

    // 数据点列表
    // 
    @NameInMap("metrics")
    public java.util.List<TopicMetricItem> metrics;

    // 开始时间
    // 
    @NameInMap("start_time")
    public Long startTime;

    // Topic 名称
    @NameInMap("topic")
    public String topic;

    public static QueryMetricsTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsTopicResponse self = new QueryMetricsTopicResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricsTopicResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetricsTopicResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetricsTopicResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetricsTopicResponse setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricsTopicResponse setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public QueryMetricsTopicResponse setMetrics(java.util.List<TopicMetricItem> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<TopicMetricItem> getMetrics() {
        return this.metrics;
    }

    public QueryMetricsTopicResponse setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryMetricsTopicResponse setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
