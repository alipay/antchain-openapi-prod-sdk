// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TopicStatusDTO extends TeaModel {
    // Topic 的最后更新时间时间戳
    @NameInMap("last_timestamp")
    @Validation(required = true)
    public Long lastTimestamp;

    // 设置该 Topic 的读写模式。取值说明如下：6：同时支持读写；4：禁写；2：禁读。
    @NameInMap("perm")
    @Validation(required = true)
    public Long perm;

    // 消息总量
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    public static TopicStatusDTO build(java.util.Map<String, ?> map) throws Exception {
        TopicStatusDTO self = new TopicStatusDTO();
        return TeaModel.build(map, self);
    }

    public TopicStatusDTO setLastTimestamp(Long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }
    public Long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public TopicStatusDTO setPerm(Long perm) {
        this.perm = perm;
        return this;
    }
    public Long getPerm() {
        return this.perm;
    }

    public TopicStatusDTO setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
