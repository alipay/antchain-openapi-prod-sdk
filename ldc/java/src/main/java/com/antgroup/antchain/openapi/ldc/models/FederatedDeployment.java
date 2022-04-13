// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FederatedDeployment extends TeaModel {
    // Standard object metadata.
    // 
    @NameInMap("metadata")
    @Validation(required = true)
    public ObjectMeta metadata;

    // Federated Deployment Override
    @NameInMap("overrides")
    @Validation(required = true)
    public java.util.List<FedDeploymentClusterOverride> overrides;

    // Federated Deployment Template
    @NameInMap("template")
    @Validation(required = true)
    public Deployment template;

    // 联邦无状态工作负载状态
    @NameInMap("status")
    @Validation(required = true)
    public FederatedDeploymentStatus status;

    public static FederatedDeployment build(java.util.Map<String, ?> map) throws Exception {
        FederatedDeployment self = new FederatedDeployment();
        return TeaModel.build(map, self);
    }

    public FederatedDeployment setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }
    public ObjectMeta getMetadata() {
        return this.metadata;
    }

    public FederatedDeployment setOverrides(java.util.List<FedDeploymentClusterOverride> overrides) {
        this.overrides = overrides;
        return this;
    }
    public java.util.List<FedDeploymentClusterOverride> getOverrides() {
        return this.overrides;
    }

    public FederatedDeployment setTemplate(Deployment template) {
        this.template = template;
        return this;
    }
    public Deployment getTemplate() {
        return this.template;
    }

    public FederatedDeployment setStatus(FederatedDeploymentStatus status) {
        this.status = status;
        return this;
    }
    public FederatedDeploymentStatus getStatus() {
        return this.status;
    }

}
