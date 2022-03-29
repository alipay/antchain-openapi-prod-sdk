// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GroupStatsItem extends TeaModel {
    // 每分钟消息大小
    @NameInMap("bpm")
    @Validation(required = true)
    public Long bpm;

    // 死信数量
    @NameInMap("dlq")
    @Validation(required = true)
    public Long dlq;

    // 消费组 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 当前 Group 消息积压的数量
    @NameInMap("msg_backlog")
    @Validation(required = true)
    public Long msgBacklog;

    // 当前每分钟 Group ID 拉请求数量
    @NameInMap("ppm")
    @Validation(required = true)
    public Long ppm;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 每分钟拉取的消息数量
    @NameInMap("tpm")
    @Validation(required = true)
    public Long tpm;

    // 每天拉取的消息数量
    @NameInMap("tpd")
    @Validation(required = true)
    public Long tpd;

    public static GroupStatsItem build(java.util.Map<String, ?> map) throws Exception {
        GroupStatsItem self = new GroupStatsItem();
        return TeaModel.build(map, self);
    }

    public GroupStatsItem setBpm(Long bpm) {
        this.bpm = bpm;
        return this;
    }
    public Long getBpm() {
        return this.bpm;
    }

    public GroupStatsItem setDlq(Long dlq) {
        this.dlq = dlq;
        return this;
    }
    public Long getDlq() {
        return this.dlq;
    }

    public GroupStatsItem setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GroupStatsItem setMsgBacklog(Long msgBacklog) {
        this.msgBacklog = msgBacklog;
        return this;
    }
    public Long getMsgBacklog() {
        return this.msgBacklog;
    }

    public GroupStatsItem setPpm(Long ppm) {
        this.ppm = ppm;
        return this;
    }
    public Long getPpm() {
        return this.ppm;
    }

    public GroupStatsItem setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public GroupStatsItem setTpm(Long tpm) {
        this.tpm = tpm;
        return this;
    }
    public Long getTpm() {
        return this.tpm;
    }

    public GroupStatsItem setTpd(Long tpd) {
        this.tpd = tpd;
        return this;
    }
    public Long getTpd() {
        return this.tpd;
    }

}
