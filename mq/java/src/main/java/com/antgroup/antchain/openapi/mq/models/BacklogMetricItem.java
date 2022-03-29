// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class BacklogMetricItem extends TeaModel {
    // 积压消息量
    @NameInMap("backlog_cnt")
    @Validation(required = true)
    public Long backlogCnt;

    // 积压数据的时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static BacklogMetricItem build(java.util.Map<String, ?> map) throws Exception {
        BacklogMetricItem self = new BacklogMetricItem();
        return TeaModel.build(map, self);
    }

    public BacklogMetricItem setBacklogCnt(Long backlogCnt) {
        this.backlogCnt = backlogCnt;
        return this;
    }
    public Long getBacklogCnt() {
        return this.backlogCnt;
    }

    public BacklogMetricItem setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
