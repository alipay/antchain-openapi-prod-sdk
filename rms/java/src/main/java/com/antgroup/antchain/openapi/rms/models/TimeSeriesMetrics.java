// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TimeSeriesMetrics extends TeaModel {
    // 开始时间, 毫秒时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 结束时间, 毫秒时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 标识 metrics，类似 sql 查询条件
    @NameInMap("tags")
    public java.util.List<KeyValuePair> tags;

    // 指标的分类
    @NameInMap("type")
    public String type;

    // Metrics 多个 point 的集合
    @NameInMap("values")
    public java.util.List<TimeSeriesMetricsPoint> values;

    public static TimeSeriesMetrics build(java.util.Map<String, ?> map) throws Exception {
        TimeSeriesMetrics self = new TimeSeriesMetrics();
        return TeaModel.build(map, self);
    }

    public TimeSeriesMetrics setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public TimeSeriesMetrics setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public TimeSeriesMetrics setTags(java.util.List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeyValuePair> getTags() {
        return this.tags;
    }

    public TimeSeriesMetrics setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TimeSeriesMetrics setValues(java.util.List<TimeSeriesMetricsPoint> values) {
        this.values = values;
        return this;
    }
    public java.util.List<TimeSeriesMetricsPoint> getValues() {
        return this.values;
    }

}
