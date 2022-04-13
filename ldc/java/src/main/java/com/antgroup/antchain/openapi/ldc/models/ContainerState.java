// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerState extends TeaModel {
    // container running state
    @NameInMap("running")
    @Validation(required = true)
    public ContainerStateRunning running;

    // container terminated state
    @NameInMap("terminated")
    @Validation(required = true)
    public ContainerStateTerminated terminated;

    // container waiting state
    @NameInMap("waiting")
    @Validation(required = true)
    public ContainerStateWaiting waiting;

    public static ContainerState build(java.util.Map<String, ?> map) throws Exception {
        ContainerState self = new ContainerState();
        return TeaModel.build(map, self);
    }

    public ContainerState setRunning(ContainerStateRunning running) {
        this.running = running;
        return this;
    }
    public ContainerStateRunning getRunning() {
        return this.running;
    }

    public ContainerState setTerminated(ContainerStateTerminated terminated) {
        this.terminated = terminated;
        return this;
    }
    public ContainerStateTerminated getTerminated() {
        return this.terminated;
    }

    public ContainerState setWaiting(ContainerStateWaiting waiting) {
        this.waiting = waiting;
        return this;
    }
    public ContainerStateWaiting getWaiting() {
        return this.waiting;
    }

}
