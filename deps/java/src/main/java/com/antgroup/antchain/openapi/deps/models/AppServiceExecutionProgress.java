// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppServiceExecutionProgress extends TeaModel {
    // base_progress
    @NameInMap("base_progress")
    @Validation(required = true)
    public ResourceGroupExecutionProgress baseProgress;

    // group_count
    @NameInMap("group_count")
    @Validation(required = true)
    public Long groupCount;

    // pre_deployment_execution_progresses
    @NameInMap("pre_deployment_execution_progresses")
    @Validation(required = true)
    public java.util.List<TaskExecutionProgress> preDeploymentExecutionProgresses;

    // post_deployment_execution_progresses
    @NameInMap("post_deployment_execution_progresses")
    @Validation(required = true)
    public java.util.List<TaskExecutionProgress> postDeploymentExecutionProgresses;

    // group_execution_progresses
    @NameInMap("group_execution_progresses")
    @Validation(required = true)
    public java.util.List<ResourceGroupExecutionProgress> groupExecutionProgresses;

    public static AppServiceExecutionProgress build(java.util.Map<String, ?> map) throws Exception {
        AppServiceExecutionProgress self = new AppServiceExecutionProgress();
        return TeaModel.build(map, self);
    }

    public AppServiceExecutionProgress setBaseProgress(ResourceGroupExecutionProgress baseProgress) {
        this.baseProgress = baseProgress;
        return this;
    }
    public ResourceGroupExecutionProgress getBaseProgress() {
        return this.baseProgress;
    }

    public AppServiceExecutionProgress setGroupCount(Long groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Long getGroupCount() {
        return this.groupCount;
    }

    public AppServiceExecutionProgress setPreDeploymentExecutionProgresses(java.util.List<TaskExecutionProgress> preDeploymentExecutionProgresses) {
        this.preDeploymentExecutionProgresses = preDeploymentExecutionProgresses;
        return this;
    }
    public java.util.List<TaskExecutionProgress> getPreDeploymentExecutionProgresses() {
        return this.preDeploymentExecutionProgresses;
    }

    public AppServiceExecutionProgress setPostDeploymentExecutionProgresses(java.util.List<TaskExecutionProgress> postDeploymentExecutionProgresses) {
        this.postDeploymentExecutionProgresses = postDeploymentExecutionProgresses;
        return this;
    }
    public java.util.List<TaskExecutionProgress> getPostDeploymentExecutionProgresses() {
        return this.postDeploymentExecutionProgresses;
    }

    public AppServiceExecutionProgress setGroupExecutionProgresses(java.util.List<ResourceGroupExecutionProgress> groupExecutionProgresses) {
        this.groupExecutionProgresses = groupExecutionProgresses;
        return this;
    }
    public java.util.List<ResourceGroupExecutionProgress> getGroupExecutionProgresses() {
        return this.groupExecutionProgresses;
    }

}
