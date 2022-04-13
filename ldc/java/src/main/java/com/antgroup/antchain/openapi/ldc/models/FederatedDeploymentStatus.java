// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FederatedDeploymentStatus extends TeaModel {
    // Federated Deployment Conditions
    @NameInMap("conditions")
    @Validation(required = true)
    public java.util.List<DeploymentCondition> conditions;

    // V1FederatedDeploymentStatus Topologies
    @NameInMap("topologies")
    @Validation(required = true)
    public java.util.List<FederatedDeploymentStatusTopologies> topologies;

    public static FederatedDeploymentStatus build(java.util.Map<String, ?> map) throws Exception {
        FederatedDeploymentStatus self = new FederatedDeploymentStatus();
        return TeaModel.build(map, self);
    }

    public FederatedDeploymentStatus setConditions(java.util.List<DeploymentCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<DeploymentCondition> getConditions() {
        return this.conditions;
    }

    public FederatedDeploymentStatus setTopologies(java.util.List<FederatedDeploymentStatusTopologies> topologies) {
        this.topologies = topologies;
        return this;
    }
    public java.util.List<FederatedDeploymentStatusTopologies> getTopologies() {
        return this.topologies;
    }

}
