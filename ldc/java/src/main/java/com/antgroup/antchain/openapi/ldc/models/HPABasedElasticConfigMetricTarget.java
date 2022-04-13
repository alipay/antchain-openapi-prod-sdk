// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HPABasedElasticConfigMetricTarget extends TeaModel {
    // 支持两种类型：AverageValue，Utilization
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // value
    @NameInMap("value")
    public HPABasedElasticConfigMetricTargetResourceValue value;

    // 利用率
    @NameInMap("utilization")
    public Long utilization;

    public static HPABasedElasticConfigMetricTarget build(java.util.Map<String, ?> map) throws Exception {
        HPABasedElasticConfigMetricTarget self = new HPABasedElasticConfigMetricTarget();
        return TeaModel.build(map, self);
    }

    public HPABasedElasticConfigMetricTarget setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HPABasedElasticConfigMetricTarget setValue(HPABasedElasticConfigMetricTargetResourceValue value) {
        this.value = value;
        return this;
    }
    public HPABasedElasticConfigMetricTargetResourceValue getValue() {
        return this.value;
    }

    public HPABasedElasticConfigMetricTarget setUtilization(Long utilization) {
        this.utilization = utilization;
        return this;
    }
    public Long getUtilization() {
        return this.utilization;
    }

}
