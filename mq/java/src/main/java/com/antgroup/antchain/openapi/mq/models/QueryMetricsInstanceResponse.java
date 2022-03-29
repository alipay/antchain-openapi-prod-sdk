// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsInstanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 消息积压数量
    @NameInMap("backlog_num")
    public Long backlogNum;

    // 死信数量
    @NameInMap("dlq_num")
    public Long dlqNum;

    // 消费组数量
    @NameInMap("group_num")
    public Long groupNum;

    // 订阅关系数量
    @NameInMap("subscription_num")
    public Long subscriptionNum;

    // Topic 数量
    @NameInMap("topic_num")
    public Long topicNum;

    // 数据更新时间戳
    @NameInMap("update_at")
    public Long updateAt;

    public static QueryMetricsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsInstanceResponse self = new QueryMetricsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricsInstanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetricsInstanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetricsInstanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetricsInstanceResponse setBacklogNum(Long backlogNum) {
        this.backlogNum = backlogNum;
        return this;
    }
    public Long getBacklogNum() {
        return this.backlogNum;
    }

    public QueryMetricsInstanceResponse setDlqNum(Long dlqNum) {
        this.dlqNum = dlqNum;
        return this;
    }
    public Long getDlqNum() {
        return this.dlqNum;
    }

    public QueryMetricsInstanceResponse setGroupNum(Long groupNum) {
        this.groupNum = groupNum;
        return this;
    }
    public Long getGroupNum() {
        return this.groupNum;
    }

    public QueryMetricsInstanceResponse setSubscriptionNum(Long subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }
    public Long getSubscriptionNum() {
        return this.subscriptionNum;
    }

    public QueryMetricsInstanceResponse setTopicNum(Long topicNum) {
        this.topicNum = topicNum;
        return this;
    }
    public Long getTopicNum() {
        return this.topicNum;
    }

    public QueryMetricsInstanceResponse setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }
    public Long getUpdateAt() {
        return this.updateAt;
    }

}
