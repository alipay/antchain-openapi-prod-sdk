// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsTargetLegalStates extends TeaModel {
    // 目标类型
    @NameInMap("target_type")
    @Validation(required = true)
    public String targetType;

    // 合法状态
    @NameInMap("states")
    @Validation(required = true)
    public java.util.List<String> states;

    public static OpsTargetLegalStates build(java.util.Map<String, ?> map) throws Exception {
        OpsTargetLegalStates self = new OpsTargetLegalStates();
        return TeaModel.build(map, self);
    }

    public OpsTargetLegalStates setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public OpsTargetLegalStates setStates(java.util.List<String> states) {
        this.states = states;
        return this;
    }
    public java.util.List<String> getStates() {
        return this.states;
    }

}
