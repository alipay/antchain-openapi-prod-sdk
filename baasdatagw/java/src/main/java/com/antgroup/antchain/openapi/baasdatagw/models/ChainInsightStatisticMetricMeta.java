// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightStatisticMetricMeta extends TeaModel {
    // 统计指标的类型；枚举：Table，Histogram
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 指标的展示名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 指标的实际名称（自定义指标ID）
    @NameInMap("metric_name")
    @Validation(required = true)
    public String metricName;

    public static ChainInsightStatisticMetricMeta build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightStatisticMetricMeta self = new ChainInsightStatisticMetricMeta();
        return TeaModel.build(map, self);
    }

    public ChainInsightStatisticMetricMeta setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightStatisticMetricMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainInsightStatisticMetricMeta setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

}
