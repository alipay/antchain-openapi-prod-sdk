// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ResourceRequirementConfig extends TeaModel {
    // limits
    @NameInMap("limits")
    public java.util.List<MapResourceNameToValue> limits;

    // requests
    @NameInMap("requests")
    public java.util.List<MapResourceNameToValue> requests;

    public static ResourceRequirementConfig build(java.util.Map<String, ?> map) throws Exception {
        ResourceRequirementConfig self = new ResourceRequirementConfig();
        return TeaModel.build(map, self);
    }

    public ResourceRequirementConfig setLimits(java.util.List<MapResourceNameToValue> limits) {
        this.limits = limits;
        return this;
    }
    public java.util.List<MapResourceNameToValue> getLimits() {
        return this.limits;
    }

    public ResourceRequirementConfig setRequests(java.util.List<MapResourceNameToValue> requests) {
        this.requests = requests;
        return this;
    }
    public java.util.List<MapResourceNameToValue> getRequests() {
        return this.requests;
    }

}
