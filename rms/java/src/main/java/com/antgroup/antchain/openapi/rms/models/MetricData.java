// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class MetricData extends TeaModel {
    // 维度信息
    @NameInMap("tags")
    @Validation(required = true)
    public java.util.List<KeySet> tags;

    // 时序数据
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<MetricValue> values;

    public static MetricData build(java.util.Map<String, ?> map) throws Exception {
        MetricData self = new MetricData();
        return TeaModel.build(map, self);
    }

    public MetricData setTags(java.util.List<KeySet> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeySet> getTags() {
        return this.tags;
    }

    public MetricData setValues(java.util.List<MetricValue> values) {
        this.values = values;
        return this;
    }
    public java.util.List<MetricValue> getValues() {
        return this.values;
    }

}
