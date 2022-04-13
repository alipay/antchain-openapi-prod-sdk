// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class RollingUpdateDeployment extends TeaModel {
    // The maximum number of pods that can be scheduled above the desired number of pods.
    @NameInMap("max_surge")
    public String maxSurge;

    // The maximum number of pods that can be unavailable during the update.
    @NameInMap("max_unavailable")
    public String maxUnavailable;

    public static RollingUpdateDeployment build(java.util.Map<String, ?> map) throws Exception {
        RollingUpdateDeployment self = new RollingUpdateDeployment();
        return TeaModel.build(map, self);
    }

    public RollingUpdateDeployment setMaxSurge(String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }
    public String getMaxSurge() {
        return this.maxSurge;
    }

    public RollingUpdateDeployment setMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }
    public String getMaxUnavailable() {
        return this.maxUnavailable;
    }

}
