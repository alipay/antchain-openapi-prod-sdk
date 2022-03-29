// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TopicMetricItem extends TeaModel {
    // 当前时间点 Topic 消费的消息数量
    @NameInMap("recv_cnt")
    @Validation(required = true)
    public Long recvCnt;

    // 当前时间点 Topic 消费的消息流量（byte）
    @NameInMap("recv_traffic")
    @Validation(required = true)
    public Long recvTraffic;

    // 当前时间点 Topic 发送的消息数量
    @NameInMap("send_cnt")
    @Validation(required = true)
    public Long sendCnt;

    // 当前时间点 Topic 发送的消息流量（byte）
    @NameInMap("send_traffic")
    @Validation(required = true)
    public Long sendTraffic;

    // 数据点的时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static TopicMetricItem build(java.util.Map<String, ?> map) throws Exception {
        TopicMetricItem self = new TopicMetricItem();
        return TeaModel.build(map, self);
    }

    public TopicMetricItem setRecvCnt(Long recvCnt) {
        this.recvCnt = recvCnt;
        return this;
    }
    public Long getRecvCnt() {
        return this.recvCnt;
    }

    public TopicMetricItem setRecvTraffic(Long recvTraffic) {
        this.recvTraffic = recvTraffic;
        return this;
    }
    public Long getRecvTraffic() {
        return this.recvTraffic;
    }

    public TopicMetricItem setSendCnt(Long sendCnt) {
        this.sendCnt = sendCnt;
        return this;
    }
    public Long getSendCnt() {
        return this.sendCnt;
    }

    public TopicMetricItem setSendTraffic(Long sendTraffic) {
        this.sendTraffic = sendTraffic;
        return this;
    }
    public Long getSendTraffic() {
        return this.sendTraffic;
    }

    public TopicMetricItem setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
