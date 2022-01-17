// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class MonitorData extends TeaModel {
    // 时间点
    @NameInMap("timestamp")
    public Long timestamp;

    // value
    @NameInMap("value")
    public Long value;

    public static MonitorData build(java.util.Map<String, ?> map) throws Exception {
        MonitorData self = new MonitorData();
        return TeaModel.build(map, self);
    }

    public MonitorData setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public MonitorData setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
