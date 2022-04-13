// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HPABasedElasticConfigMetricTargetResourceValue extends TeaModel {
    // 数值
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 数值单位:
    // Byte, Ki, Mi, Gi, Ti, Pi
    // m, C
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    public static HPABasedElasticConfigMetricTargetResourceValue build(java.util.Map<String, ?> map) throws Exception {
        HPABasedElasticConfigMetricTargetResourceValue self = new HPABasedElasticConfigMetricTargetResourceValue();
        return TeaModel.build(map, self);
    }

    public HPABasedElasticConfigMetricTargetResourceValue setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public HPABasedElasticConfigMetricTargetResourceValue setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
