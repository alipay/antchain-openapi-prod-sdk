// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HealthCheckConfig extends TeaModel {
    // liveness 检查
    // 
    @NameInMap("liveness_probe")
    public HealthCheckProbe livenessProbe;

    // readiness 检查
    // 
    @NameInMap("readiness_probe")
    public HealthCheckProbe readinessProbe;

    public static HealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
        HealthCheckConfig self = new HealthCheckConfig();
        return TeaModel.build(map, self);
    }

    public HealthCheckConfig setLivenessProbe(HealthCheckProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }
    public HealthCheckProbe getLivenessProbe() {
        return this.livenessProbe;
    }

    public HealthCheckConfig setReadinessProbe(HealthCheckProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }
    public HealthCheckProbe getReadinessProbe() {
        return this.readinessProbe;
    }

}
