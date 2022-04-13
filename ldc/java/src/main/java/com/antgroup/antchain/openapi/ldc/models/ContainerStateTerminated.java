// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerStateTerminated extends TeaModel {
    // container id
    @NameInMap("container_id")
    @Validation(required = true)
    public String containerId;

    // exit code
    @NameInMap("exit_code")
    @Validation(required = true)
    public Long exitCode;

    // container结束时间
    @NameInMap("finished_at")
    @Validation(required = true)
    public String finishedAt;

    // message
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // reason
    @NameInMap("reason")
    @Validation(required = true)
    public String reason;

    // signal
    @NameInMap("signal")
    @Validation(required = true)
    public String signal;

    // container start time
    @NameInMap("started_at")
    @Validation(required = true)
    public String startedAt;

    public static ContainerStateTerminated build(java.util.Map<String, ?> map) throws Exception {
        ContainerStateTerminated self = new ContainerStateTerminated();
        return TeaModel.build(map, self);
    }

    public ContainerStateTerminated setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public ContainerStateTerminated setExitCode(Long exitCode) {
        this.exitCode = exitCode;
        return this;
    }
    public Long getExitCode() {
        return this.exitCode;
    }

    public ContainerStateTerminated setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public ContainerStateTerminated setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ContainerStateTerminated setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ContainerStateTerminated setSignal(String signal) {
        this.signal = signal;
        return this;
    }
    public String getSignal() {
        return this.signal;
    }

    public ContainerStateTerminated setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

}
