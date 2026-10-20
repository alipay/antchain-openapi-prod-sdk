// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MetricItemInfo extends TeaModel {
    // 指标类型 心率:HEART_RATE/血氧:BLOOD_OXYGEN/体温:BODY_TEMP/步数:STEPS/睡眠:SLEEP/呼吸率:RESP_RATE/压力:STRESS/疲劳:FATIGUE/情绪:EMOTION/...
    /**
     * <strong>example:</strong>
     * <p>HEART_RATE</p>
     */
    @NameInMap("metric_type")
    @Validation(required = true)
    public String metricType;

    // 测量时间(毫秒级时间戳)
    @NameInMap("measure_time")
    @Validation(required = true)
    public Long measureTime;

    // 指标值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 指标值单位 -平台固定值
    @NameInMap("unit")
    public String unit;

    // 扩展字段（JSON），如睡眠阶段时长等
    @NameInMap("ext")
    public String ext;

    public static MetricItemInfo build(java.util.Map<String, ?> map) throws Exception {
        MetricItemInfo self = new MetricItemInfo();
        return TeaModel.build(map, self);
    }

    public MetricItemInfo setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public MetricItemInfo setMeasureTime(Long measureTime) {
        this.measureTime = measureTime;
        return this;
    }
    public Long getMeasureTime() {
        return this.measureTime;
    }

    public MetricItemInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public MetricItemInfo setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public MetricItemInfo setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
