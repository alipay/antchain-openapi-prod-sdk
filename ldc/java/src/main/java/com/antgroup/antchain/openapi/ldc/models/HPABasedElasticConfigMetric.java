// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HPABasedElasticConfigMetric extends TeaModel {
    // 指标名称：
    // CPU，Memory，QPS，RT
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 目标值
    @NameInMap("target")
    @Validation(required = true)
    public HPABasedElasticConfigMetricTarget target;

    public static HPABasedElasticConfigMetric build(java.util.Map<String, ?> map) throws Exception {
        HPABasedElasticConfigMetric self = new HPABasedElasticConfigMetric();
        return TeaModel.build(map, self);
    }

    public HPABasedElasticConfigMetric setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HPABasedElasticConfigMetric setTarget(HPABasedElasticConfigMetricTarget target) {
        this.target = target;
        return this;
    }
    public HPABasedElasticConfigMetricTarget getTarget() {
        return this.target;
    }

}
