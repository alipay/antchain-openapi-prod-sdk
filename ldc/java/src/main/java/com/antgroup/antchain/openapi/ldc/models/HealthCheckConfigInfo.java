// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HealthCheckConfigInfo extends TeaModel {
    // 容器健康检查配置liveness probe。
    @NameInMap("liveness_probe")
    public LivenessProbe livenessProbe;

    // 容器健康检查配置readiness probe。
    @NameInMap("readiness_probe")
    public ReadinessProbe readinessProbe;

    public static HealthCheckConfigInfo build(java.util.Map<String, ?> map) throws Exception {
        HealthCheckConfigInfo self = new HealthCheckConfigInfo();
        return TeaModel.build(map, self);
    }

    public HealthCheckConfigInfo setLivenessProbe(LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }
    public LivenessProbe getLivenessProbe() {
        return this.livenessProbe;
    }

    public HealthCheckConfigInfo setReadinessProbe(ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }
    public ReadinessProbe getReadinessProbe() {
        return this.readinessProbe;
    }

}
