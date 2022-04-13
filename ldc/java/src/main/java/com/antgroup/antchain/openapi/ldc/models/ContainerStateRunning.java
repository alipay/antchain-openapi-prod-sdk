// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerStateRunning extends TeaModel {
    // container启动时间
    @NameInMap("started_at")
    @Validation(required = true)
    public String startedAt;

    public static ContainerStateRunning build(java.util.Map<String, ?> map) throws Exception {
        ContainerStateRunning self = new ContainerStateRunning();
        return TeaModel.build(map, self);
    }

    public ContainerStateRunning setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

}
