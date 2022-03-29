// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TimeSeriesMetricsPoint extends TeaModel {
    // 时间戳 (毫秒)
    @NameInMap("timestamp")
    public Long timestamp;

    // Metrics 某时间点的具体值
    @NameInMap("value")
    public java.util.List<TimeSeriesMetricsField> value;

    public static TimeSeriesMetricsPoint build(java.util.Map<String, ?> map) throws Exception {
        TimeSeriesMetricsPoint self = new TimeSeriesMetricsPoint();
        return TeaModel.build(map, self);
    }

    public TimeSeriesMetricsPoint setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TimeSeriesMetricsPoint setValue(java.util.List<TimeSeriesMetricsField> value) {
        this.value = value;
        return this;
    }
    public java.util.List<TimeSeriesMetricsField> getValue() {
        return this.value;
    }

}
