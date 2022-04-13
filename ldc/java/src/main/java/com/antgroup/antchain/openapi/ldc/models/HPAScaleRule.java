// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HPAScaleRule extends TeaModel {
    // 冷却窗口时间
    @NameInMap("stabilization_window_seconds")
    public Long stabilizationWindowSeconds;

    // 扩缩容策略
    @NameInMap("policies")
    public java.util.List<HPAScalePolicy> policies;

    public static HPAScaleRule build(java.util.Map<String, ?> map) throws Exception {
        HPAScaleRule self = new HPAScaleRule();
        return TeaModel.build(map, self);
    }

    public HPAScaleRule setStabilizationWindowSeconds(Long stabilizationWindowSeconds) {
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
        return this;
    }
    public Long getStabilizationWindowSeconds() {
        return this.stabilizationWindowSeconds;
    }

    public HPAScaleRule setPolicies(java.util.List<HPAScalePolicy> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<HPAScalePolicy> getPolicies() {
        return this.policies;
    }

}
