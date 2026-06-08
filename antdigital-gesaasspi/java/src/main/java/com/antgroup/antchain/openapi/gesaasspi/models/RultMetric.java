// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class RultMetric extends TeaModel {
    // 度量编码
    /**
     * <strong>example:</strong>
     * <p>ori_use_amount</p>
     */
    @NameInMap("metric_code")
    @Validation(required = true)
    public String metricCode;

    // 度量聚合结果
    /**
     * <strong>example:</strong>
     * <p>21.22</p>
     */
    @NameInMap("metric_value")
    @Validation(required = true)
    public String metricValue;

    public static RultMetric build(java.util.Map<String, ?> map) throws Exception {
        RultMetric self = new RultMetric();
        return TeaModel.build(map, self);
    }

    public RultMetric setMetricCode(String metricCode) {
        this.metricCode = metricCode;
        return this;
    }
    public String getMetricCode() {
        return this.metricCode;
    }

    public RultMetric setMetricValue(String metricValue) {
        this.metricValue = metricValue;
        return this;
    }
    public String getMetricValue() {
        return this.metricValue;
    }

}
