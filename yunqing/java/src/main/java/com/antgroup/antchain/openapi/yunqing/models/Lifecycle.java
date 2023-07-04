// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Lifecycle extends TeaModel {
    // 存活探针
    @NameInMap("liveness")
    public ProbeConfig liveness;

    // readiness
    @NameInMap("readiness")
    public ProbeConfig readiness;

    // preStop
    @NameInMap("pre_stop")
    public ProbeConfig preStop;

    // postStart
    @NameInMap("post_start")
    public ProbeConfig postStart;

    // startUp
    @NameInMap("start_up")
    public ProbeConfig startUp;

    // entrypoint
    @NameInMap("entrypoint")
    public ProbeConfig entrypoint;

    public static Lifecycle build(java.util.Map<String, ?> map) throws Exception {
        Lifecycle self = new Lifecycle();
        return TeaModel.build(map, self);
    }

    public Lifecycle setLiveness(ProbeConfig liveness) {
        this.liveness = liveness;
        return this;
    }
    public ProbeConfig getLiveness() {
        return this.liveness;
    }

    public Lifecycle setReadiness(ProbeConfig readiness) {
        this.readiness = readiness;
        return this;
    }
    public ProbeConfig getReadiness() {
        return this.readiness;
    }

    public Lifecycle setPreStop(ProbeConfig preStop) {
        this.preStop = preStop;
        return this;
    }
    public ProbeConfig getPreStop() {
        return this.preStop;
    }

    public Lifecycle setPostStart(ProbeConfig postStart) {
        this.postStart = postStart;
        return this;
    }
    public ProbeConfig getPostStart() {
        return this.postStart;
    }

    public Lifecycle setStartUp(ProbeConfig startUp) {
        this.startUp = startUp;
        return this;
    }
    public ProbeConfig getStartUp() {
        return this.startUp;
    }

    public Lifecycle setEntrypoint(ProbeConfig entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }
    public ProbeConfig getEntrypoint() {
        return this.entrypoint;
    }

}
