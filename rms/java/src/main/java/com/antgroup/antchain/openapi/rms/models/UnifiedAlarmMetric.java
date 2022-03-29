// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UnifiedAlarmMetric extends TeaModel {
    // 指标
    @NameInMap("metric")
    @Validation(required = true)
    public String metric;

    // 指标数据
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<MetricData> data;

    public static UnifiedAlarmMetric build(java.util.Map<String, ?> map) throws Exception {
        UnifiedAlarmMetric self = new UnifiedAlarmMetric();
        return TeaModel.build(map, self);
    }

    public UnifiedAlarmMetric setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public UnifiedAlarmMetric setData(java.util.List<MetricData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MetricData> getData() {
        return this.data;
    }

}
