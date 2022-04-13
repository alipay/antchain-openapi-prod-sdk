// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodReadinessGate extends TeaModel {
    // ConditionType refers to a condition in the pod_s condition list with matching type.
    @NameInMap("condition_type")
    @Validation(required = true)
    public String conditionType;

    public static PodReadinessGate build(java.util.Map<String, ?> map) throws Exception {
        PodReadinessGate self = new PodReadinessGate();
        return TeaModel.build(map, self);
    }

    public PodReadinessGate setConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }
    public String getConditionType() {
        return this.conditionType;
    }

}
