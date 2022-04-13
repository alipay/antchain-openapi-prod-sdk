// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeploymentSpec extends TeaModel {
    // Minimum number of seconds for which a newly created pod should be ready without any of its container crashing
    @NameInMap("min_ready_seconds")
    public Long minReadySeconds;

    // Indicates that the deployment is paused.
    // 
    @NameInMap("paused")
    public Boolean paused;

    // he maximum time in seconds for a deployment to make progress before it is considered to be failed.
    @NameInMap("progress_deadline_seconds")
    public Long progressDeadlineSeconds;

    // Number of desired pods. 
    @NameInMap("replicas")
    @Validation(required = true)
    public Long replicas;

    // The number of old ReplicaSets to retain to allow rollback.
    @NameInMap("revision_history_limit")
    public Long revisionHistoryLimit;

    // Label selector for pods. 
    @NameInMap("selector")
    public LabelSelector selector;

    // The deployment strategy to use to replace existing pods with new ones.
    // 
    @NameInMap("strategy")
    public DeploymentStrategy strategy;

    // Template describes the pods that will be created.
    @NameInMap("template")
    @Validation(required = true)
    public PodTemplateSpec template;

    public static DeploymentSpec build(java.util.Map<String, ?> map) throws Exception {
        DeploymentSpec self = new DeploymentSpec();
        return TeaModel.build(map, self);
    }

    public DeploymentSpec setMinReadySeconds(Long minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }
    public Long getMinReadySeconds() {
        return this.minReadySeconds;
    }

    public DeploymentSpec setPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }
    public Boolean getPaused() {
        return this.paused;
    }

    public DeploymentSpec setProgressDeadlineSeconds(Long progressDeadlineSeconds) {
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        return this;
    }
    public Long getProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds;
    }

    public DeploymentSpec setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public DeploymentSpec setRevisionHistoryLimit(Long revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }
    public Long getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public DeploymentSpec setSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }
    public LabelSelector getSelector() {
        return this.selector;
    }

    public DeploymentSpec setStrategy(DeploymentStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public DeploymentStrategy getStrategy() {
        return this.strategy;
    }

    public DeploymentSpec setTemplate(PodTemplateSpec template) {
        this.template = template;
        return this;
    }
    public PodTemplateSpec getTemplate() {
        return this.template;
    }

}
