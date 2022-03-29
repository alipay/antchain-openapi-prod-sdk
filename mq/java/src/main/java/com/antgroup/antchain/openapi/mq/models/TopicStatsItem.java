// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TopicStatsItem extends TeaModel {
    // 该 Topic 每分钟发送的消息大小（byte）
    @NameInMap("bpm")
    @Validation(required = true)
    public Long bpm;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 该 Topic 每分钟发送的消息数量
    @NameInMap("tpm")
    @Validation(required = true)
    public Long tpm;

    // 该 Topic 每天发送的消息数量	
    // 
    @NameInMap("tpd")
    @Validation(required = true)
    public Long tpd;

    // 该 Topic 每天发送的消息大小（byte）	
    // 
    @NameInMap("bpd")
    @Validation(required = true)
    public Long bpd;

    public static TopicStatsItem build(java.util.Map<String, ?> map) throws Exception {
        TopicStatsItem self = new TopicStatsItem();
        return TeaModel.build(map, self);
    }

    public TopicStatsItem setBpm(Long bpm) {
        this.bpm = bpm;
        return this;
    }
    public Long getBpm() {
        return this.bpm;
    }

    public TopicStatsItem setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public TopicStatsItem setTpm(Long tpm) {
        this.tpm = tpm;
        return this;
    }
    public Long getTpm() {
        return this.tpm;
    }

    public TopicStatsItem setTpd(Long tpd) {
        this.tpd = tpd;
        return this;
    }
    public Long getTpd() {
        return this.tpd;
    }

    public TopicStatsItem setBpd(Long bpd) {
        this.bpd = bpd;
        return this;
    }
    public Long getBpd() {
        return this.bpd;
    }

}
