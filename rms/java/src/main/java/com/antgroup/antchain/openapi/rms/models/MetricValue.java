// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class MetricValue extends TeaModel {
    // 时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // double类型值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MetricValue build(java.util.Map<String, ?> map) throws Exception {
        MetricValue self = new MetricValue();
        return TeaModel.build(map, self);
    }

    public MetricValue setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public MetricValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
