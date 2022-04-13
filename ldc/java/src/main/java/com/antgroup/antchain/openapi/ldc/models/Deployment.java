// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Deployment extends TeaModel {
    // Standard object metadata.
    // 
    @NameInMap("metadata")
    @Validation(required = true)
    public ObjectMeta metadata;

    // Specification of the desired behavior of the Deployment.
    // 
    @NameInMap("spec")
    @Validation(required = true)
    public DeploymentSpec spec;

    // Most recently observed status of the Deployment.
    // 
    @NameInMap("status")
    @Validation(required = true)
    public DeploymentStatus status;

    public static Deployment build(java.util.Map<String, ?> map) throws Exception {
        Deployment self = new Deployment();
        return TeaModel.build(map, self);
    }

    public Deployment setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }
    public ObjectMeta getMetadata() {
        return this.metadata;
    }

    public Deployment setSpec(DeploymentSpec spec) {
        this.spec = spec;
        return this;
    }
    public DeploymentSpec getSpec() {
        return this.spec;
    }

    public Deployment setStatus(DeploymentStatus status) {
        this.status = status;
        return this;
    }
    public DeploymentStatus getStatus() {
        return this.status;
    }

}
