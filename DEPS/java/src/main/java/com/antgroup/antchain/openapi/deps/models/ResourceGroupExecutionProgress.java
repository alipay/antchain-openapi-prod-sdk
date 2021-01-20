// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ResourceGroupExecutionProgress extends TeaModel {
    // finished_time
    @NameInMap("finished_time")
    public Boolean finishedTime;

    // id
    @NameInMap("id")
    public String id;

    // paas_id
    @NameInMap("paas_id")
    public String paasId;

    // resource_count
    @NameInMap("resource_count")
    public Long resourceCount;

    // resource_states
    @NameInMap("resource_states")
    public java.util.List<Pair> resourceStates;

    // standalone_executable
    @NameInMap("standalone_executable")
    public Boolean standaloneExecutable;

    // started_time
    @NameInMap("started_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startedTime;

    // state
    @NameInMap("state")
    public String state;

    // refer_key
    @NameInMap("refer_key")
    public String referKey;

    public static ResourceGroupExecutionProgress build(java.util.Map<String, ?> map) throws Exception {
        ResourceGroupExecutionProgress self = new ResourceGroupExecutionProgress();
        return TeaModel.build(map, self);
    }

    public ResourceGroupExecutionProgress setFinishedTime(Boolean finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public Boolean getFinishedTime() {
        return this.finishedTime;
    }

    public ResourceGroupExecutionProgress setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ResourceGroupExecutionProgress setPaasId(String paasId) {
        this.paasId = paasId;
        return this;
    }
    public String getPaasId() {
        return this.paasId;
    }

    public ResourceGroupExecutionProgress setResourceCount(Long resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }
    public Long getResourceCount() {
        return this.resourceCount;
    }

    public ResourceGroupExecutionProgress setResourceStates(java.util.List<Pair> resourceStates) {
        this.resourceStates = resourceStates;
        return this;
    }
    public java.util.List<Pair> getResourceStates() {
        return this.resourceStates;
    }

    public ResourceGroupExecutionProgress setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public ResourceGroupExecutionProgress setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public ResourceGroupExecutionProgress setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ResourceGroupExecutionProgress setReferKey(String referKey) {
        this.referKey = referKey;
        return this;
    }
    public String getReferKey() {
        return this.referKey;
    }

}
