// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class RateLimitEffectScopeDTO extends TeaModel {
    // RateLimitEffectScopeValueDTO list
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<RateLimitEffectScopeValueDTO> values;

    public static RateLimitEffectScopeDTO build(java.util.Map<String, ?> map) throws Exception {
        RateLimitEffectScopeDTO self = new RateLimitEffectScopeDTO();
        return TeaModel.build(map, self);
    }

    public RateLimitEffectScopeDTO setValues(java.util.List<RateLimitEffectScopeValueDTO> values) {
        this.values = values;
        return this;
    }
    public java.util.List<RateLimitEffectScopeValueDTO> getValues() {
        return this.values;
    }

}
