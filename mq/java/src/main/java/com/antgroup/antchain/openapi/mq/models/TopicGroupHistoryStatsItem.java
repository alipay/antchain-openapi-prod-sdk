// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TopicGroupHistoryStatsItem extends TeaModel {
    // 当前时间点的死信数量
    @NameInMap("dlq")
    @Validation(required = true)
    public Long dlq;

    // 当前时间点的消息积压量
    @NameInMap("msg_backlog")
    @Validation(required = true)
    public Long msgBacklog;

    // 每分钟消费数据大小
    @NameInMap("recv_bpm")
    @Validation(required = true)
    public Long recvBpm;

    // 每分钟拉请求数量
    @NameInMap("recv_ppm")
    @Validation(required = true)
    public Long recvPpm;

    // 消费 TPM
    @NameInMap("recv_tpm")
    @Validation(required = true)
    public Long recvTpm;

    // 每分钟发送消息大小
    @NameInMap("send_bpm")
    @Validation(required = true)
    public Long sendBpm;

    // 发送 TPM
    @NameInMap("send_tpm")
    @Validation(required = true)
    public Long sendTpm;

    // Unix 时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static TopicGroupHistoryStatsItem build(java.util.Map<String, ?> map) throws Exception {
        TopicGroupHistoryStatsItem self = new TopicGroupHistoryStatsItem();
        return TeaModel.build(map, self);
    }

    public TopicGroupHistoryStatsItem setDlq(Long dlq) {
        this.dlq = dlq;
        return this;
    }
    public Long getDlq() {
        return this.dlq;
    }

    public TopicGroupHistoryStatsItem setMsgBacklog(Long msgBacklog) {
        this.msgBacklog = msgBacklog;
        return this;
    }
    public Long getMsgBacklog() {
        return this.msgBacklog;
    }

    public TopicGroupHistoryStatsItem setRecvBpm(Long recvBpm) {
        this.recvBpm = recvBpm;
        return this;
    }
    public Long getRecvBpm() {
        return this.recvBpm;
    }

    public TopicGroupHistoryStatsItem setRecvPpm(Long recvPpm) {
        this.recvPpm = recvPpm;
        return this;
    }
    public Long getRecvPpm() {
        return this.recvPpm;
    }

    public TopicGroupHistoryStatsItem setRecvTpm(Long recvTpm) {
        this.recvTpm = recvTpm;
        return this;
    }
    public Long getRecvTpm() {
        return this.recvTpm;
    }

    public TopicGroupHistoryStatsItem setSendBpm(Long sendBpm) {
        this.sendBpm = sendBpm;
        return this;
    }
    public Long getSendBpm() {
        return this.sendBpm;
    }

    public TopicGroupHistoryStatsItem setSendTpm(Long sendTpm) {
        this.sendTpm = sendTpm;
        return this;
    }
    public Long getSendTpm() {
        return this.sendTpm;
    }

    public TopicGroupHistoryStatsItem setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
