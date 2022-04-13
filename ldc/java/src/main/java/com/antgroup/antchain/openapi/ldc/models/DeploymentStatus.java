// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeploymentStatus extends TeaModel {
    // Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
    // 
    @NameInMap("available_replicas")
    @Validation(required = true)
    public Long availableReplicas;

    // Represents the latest available observations of a deployment_s current state.
    // 
    @NameInMap("conditions")
    @Validation(required = true)
    public java.util.List<DeploymentCondition> conditions;

    // The generation observed by the deployment controller.
    // 
    @NameInMap("observed_generation")
    public Long observedGeneration;

    // Total number of ready pods targeted by this deployment.
    // 
    @NameInMap("ready_replicas")
    @Validation(required = true)
    public Long readyReplicas;

    // Total number of non-terminated pods targeted by this deployment (their labels match the selector).
    // 
    @NameInMap("replicas")
    @Validation(required = true)
    public Long replicas;

    // Total number of unavailable pods targeted by this deployment. 
    @NameInMap("unavailable_replicas")
    @Validation(required = true)
    public Long unavailableReplicas;

    // Total number of non-terminated pods targeted by this deployment that have the desired template spec.
    @NameInMap("updated_replicas")
    @Validation(required = true)
    public Long updatedReplicas;

    public static DeploymentStatus build(java.util.Map<String, ?> map) throws Exception {
        DeploymentStatus self = new DeploymentStatus();
        return TeaModel.build(map, self);
    }

    public DeploymentStatus setAvailableReplicas(Long availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }
    public Long getAvailableReplicas() {
        return this.availableReplicas;
    }

    public DeploymentStatus setConditions(java.util.List<DeploymentCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<DeploymentCondition> getConditions() {
        return this.conditions;
    }

    public DeploymentStatus setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public DeploymentStatus setReadyReplicas(Long readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }
    public Long getReadyReplicas() {
        return this.readyReplicas;
    }

    public DeploymentStatus setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public DeploymentStatus setUnavailableReplicas(Long unavailableReplicas) {
        this.unavailableReplicas = unavailableReplicas;
        return this;
    }
    public Long getUnavailableReplicas() {
        return this.unavailableReplicas;
    }

    public DeploymentStatus setUpdatedReplicas(Long updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
        return this;
    }
    public Long getUpdatedReplicas() {
        return this.updatedReplicas;
    }

}
